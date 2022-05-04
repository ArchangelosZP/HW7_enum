public class MobilePhone extends ElectricalDevice {
    @Override
    public void addCharge(){
        this.chargeLevel = this.chargeLevel+2;
    }
}
