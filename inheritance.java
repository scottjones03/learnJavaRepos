class Door {
    public void push () {}
    public void pull () {}
    public void open () {
        push();
    }
}
class BankVaultDoor extends Door {
    public void enterCombination() {}
    public void open () {
        enterCombination();
        pull();
    }
}
class HouseFrontDoor extends Door {
    public void unlockDoorKnob() {}
    public void open () {
        unlockDoorKnob();
        super.open();
    }
}
class CarDoor extends Door {}
public class inheritance {
    public static void main(String[] args) {
        Door d1 = new BankVaultDoor();
        Door d2 = new HouseFrontDoor();
        Door d3 = new CarDoor();
        if (args[0] == "car") {
            d3.open();
        } else if (args[0] == "bank") {
            d1.open();
        } else {
            d2.open();
        }
    }

    
}