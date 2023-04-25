package Homework_3.base.classes.checkInputData;

import Homework_3.base.abstractClasses.ACheckQuantity;
import Homework_3.base.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}