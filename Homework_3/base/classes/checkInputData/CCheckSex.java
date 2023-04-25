package Homework_3.base.classes.checkInputData;

import Homework_3.base.abstractClasses.ACheckData;
import Homework_3.base.exceptions.CheckSexException;
import Homework_3.base.exceptions.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}