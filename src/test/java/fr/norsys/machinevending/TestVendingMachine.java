package fr.norsys.machinevending;

import org.junit.jupiter.api.Test;

import fr.norsys.machinevending.Coin;
import fr.norsys.machinevending.Product;
import fr.norsys.machinevending.VendingMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestVendingMachine {

  

    @Test
    public void testCancelRequest() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addCoins(Coin.ONE, 10);
        vendingMachine.insertCoin(Coin.ONE);
        String result = vendingMachine.cancelRequest();
        assertEquals("Refund: 1", result);
    }

    @Test
    public void testReset() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(Product.COCA, 3);
        vendingMachine.addCoins(Coin.FIVE, 5);
        vendingMachine.reset();
        assertTrue(vendingMachine.products.isEmpty());
        assertTrue(vendingMachine.coins.isEmpty());
        assertEquals(0, vendingMachine.currentAmount);
    }
}
