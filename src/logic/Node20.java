/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;

/**
 *
 * @author student1
 */
public class Node20 extends Node {

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws Exception{
        if (currency.getAmount() >= 20) {
            int a = currency.getAmount() / 20;
            int b = currency.getAmount() % 20;
            if (a < notesNumber) {
                map.put("20", a);
                notesNumber -= a;
            } else {
                map.put("20", notesNumber);
                b += (a - notesNumber) * 20;
                notesNumber = 0;
            }
            if (b != 0 && next != null) {
                next.getCurrency(new Currency(b), map);
            }
        } else {
            map.put("20", 0);
            if (next != null) {
                next.getCurrency(currency, map);
            }
        }
    }

}
