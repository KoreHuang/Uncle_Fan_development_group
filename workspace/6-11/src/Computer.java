
public class Computer {
	public void readUsb(usb sUsb){
		sUsb.read();
	}
	public void writeUsb(usb sUsb){
		sUsb.write();
	}
	public static void main(String[] args) {
		samsung ss=new samsung();
		sony sn=new sony();
		Computer comp=new Computer();
		comp.readUsb(ss);
		comp.writeUsb(sn);
	}
}
