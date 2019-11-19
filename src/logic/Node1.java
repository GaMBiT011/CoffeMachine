/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;
import exception.NotEnoughCashException;

/**
 *
 * @author student1
 */
public class Node1 extends Node {

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws Exception {
        if (currency.getAmount() >= 1) {
            if (currency.getAmount() <= notesNumber) {
                map.put("1", currency.getAmount());
                notesNumber -= currency.getAmount();
            } else {
                map.put("1", notesNumber);
                notesNumber = 0;
                throw new NotEnoughCashException("The machine does not have enough cash, call service! Missing: " + (currency.getAmount() - map.get("1")) + " RSD");
            }

        } else {
            map.put("1", 0);
        }
    }

}
