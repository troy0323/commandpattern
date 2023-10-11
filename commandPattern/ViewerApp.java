package commandPattern;

import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Lights lights = new Lights();
        RemoteControl rc = new RemoteControl();
        Thermostat thermostat = new Thermostat();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Enter a command:\n[1]Music on\n[2]Music off\n[3]Volume up\n[4]Volume down\n[5]Turn on lights\n[6]Turn off lights\n[7]Increase brightness" +
                    "\n[8]Decrease brightness\n[9]Turn on Thermostat\n[10]Turn off Thermostat\n[11]Increase Temperature\n[12]Decrease Temperature\n[13]Exit");


            String userCommand = scanner.nextLine().toLowerCase();

            switch (userCommand) {
                case "1":
                    System.out.println("Music Player turning on");
                    rc.setCommand(new MusicOn(musicPlayer));
                    rc.clickButton();
                    break;
                case "2":
                    System.out.println("Music Player turning off");
                    rc.setCommand(new MusicOff(musicPlayer));
                    rc.clickButton();
                    break;
                case "3":

                    rc.setCommand(new VolumeUp(musicPlayer));
                    rc.clickButton();
                    break;
                case "4":

                    rc.setCommand(new VolumeDown(musicPlayer));
                    rc.clickButton();
                    break;
                case "5":
                    System.out.println("Lights turning on");
                    rc.setCommand(new LightsOn(lights));
                    rc.clickButton();
                    break;
                case "6":
                    System.out.println("Lights turning off");
                    rc.setCommand(new LightsOff(lights));
                    rc.clickButton();
                    break;
                case "7":
                    rc.setCommand(new BrightUp(lights));
                    rc.clickButton();
                    break;
                case "8":
                    rc.setCommand(new BrightDown(lights));
                    rc.clickButton();
                    break;
                case "9":
                    System.out.println("Thermostat turning on");
                    rc.setCommand(new ThermosOn(thermostat));
                    rc.clickButton();
                    break;
                case "10":
                    System.out.println("Thermostat turning off");
                    rc.setCommand(new ThermosOff(thermostat));
                    rc.clickButton();
                    break;
                case "11":
                    rc.setCommand(new TempUp(thermostat));
                    rc.clickButton();
                    break;
                case "12":
                    rc.setCommand(new TempDown(thermostat));
                    rc.clickButton();
                      break;
                case "13":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");

            }
        }
    }
}

