/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;
//Command Pattern (Patrón Comando)
//Este patrón encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes,
// encolar solicitudes o realizar operaciones reversibles (deshacer/rehacer).
public class main {
    // Interfaz para los comandos
    interface Command {
        void execute();
    }

    // Receptor: La luz
    static class Light {
        public void turnOn() {
            System.out.println("Luz encendida.");
        }
        public void turnOff() {
            System.out.println("Luz apagada.");
        }
    }

    // Comando concreto para encender la luz
    static class TurnOnLightCommand implements Command {
        private Light light;

        public TurnOnLightCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }
    }

    // Comando concreto para apagar la luz
    static class TurnOffLightCommand implements Command {
        private Light light;

        public TurnOffLightCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOff();
        }
    }

    // Invocador: Control remoto
    static class RemoteControl {
        private Command command;

        public void setCommand(Command command) {
            this.command = command;
        }

        public void pressButton() {
            command.execute();
        }
    }

    // Cliente

        public static void main(String[] args) {
            Light light = new Light();
            Command turnOn = new TurnOnLightCommand(light);
            Command turnOff = new TurnOffLightCommand(light);

            RemoteControl remote = new RemoteControl();

            remote.setCommand(turnOn);
            remote.pressButton(); // Luz encendida.

            remote.setCommand(turnOff);
            remote.pressButton(); // Luz apagada.
        }
}
