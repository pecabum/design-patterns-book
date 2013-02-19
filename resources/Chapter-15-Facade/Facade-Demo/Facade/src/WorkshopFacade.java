/*
 * This class is only for demonstration purposes.
 * In order to keep the example simple, we will
 * keep the duplicated code and will not provide 
 * more advanced features like single instance creation. 
 */
public class WorkshopFacade {

	private Robot robot;
	private Mixer mixer;
	private Cutter cutter;
	private Heater heater;
	private Packer packer;

	public WorkshopFacade() {
		this.robot = new Robot();
		this.mixer = new Mixer();
		this.cutter = new Cutter();
		this.heater = new Heater();
		this.packer = new Packer();
	}

	public void makeBread() {
		robot.turnOn();

		robot.move("������", "�����", "������");
		robot.move("���", "�����", "������");
		robot.move("�����", "�����", "������");
		robot.move("����", "�����", "������");
		robot.move("���", "�����", "������");

		mixer.turnOn();
		mixer.mix();
		mixer.turnOff();

		robot.move("�����", "������", "������ �� ������");

		cutter.turnOn();
		cutter.cutDough();
		cutter.turnOff();

		robot.move("�����", "������ �� ������", "����������");

		heater.turnOn();
		heater.bakeBread();
		heater.turnOff();

		robot.move("����", "����������", "���������� ������");

		packer.turnOn();
		packer.packBread();
		packer.turnOff();

		robot.move("����", "���������� ������", "�����");

		robot.turnOff();
	}

	public void makeDough() {
		robot.turnOn();

		robot.move("������", "�����", "������");
		robot.move("���", "�����", "������");
		robot.move("�����", "�����", "������");
		robot.move("����", "�����", "������");
		robot.move("���", "�����", "������");

		mixer.turnOn();
		mixer.mix();
		mixer.turnOff();

		robot.move("�����", "������", "������ �� ������");

		cutter.turnOn();
		cutter.cutDough();
		cutter.turnOff();

		robot.move("�����", "������ �� ������", "���������� ������");

		packer.turnOn();
		packer.packBread();
		packer.turnOff();

		robot.move("�����", "���������� ������", "�����");

		robot.turnOff();
	}

}
