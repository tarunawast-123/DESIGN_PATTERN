package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
