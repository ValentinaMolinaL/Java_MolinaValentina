package Mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator
//Este patrón define un objeto que centraliza la comunicación entre otros objetos, reduciendo la dependencia entre ellos.
public class main {
    // Mediador
    interface ChatMediator {
        void sendMessage(String message, User user);
        void addUser(User user);
    }

    // Implementación del mediador
    static class ChatRoom implements ChatMediator {
        private List<User> users = new ArrayList<>();

        @Override
        public void addUser(User user) {
            users.add(user);
        }

        @Override
        public void sendMessage(String message, User sender) {
            for (User user : users) {
                if (user != sender) {
                    user.receive(message);
                }
            }
        }
    }

    // Clase abstracta para los usuarios
    static abstract class User {
        protected ChatMediator mediator;
        protected String name;

        public User(ChatMediator mediator, String name) {
            this.mediator = mediator;
            this.name = name;
        }

        public abstract void send(String message);
        public abstract void receive(String message);
    }

    // Usuario concreto
    static class ChatUser extends User {
        public ChatUser(ChatMediator mediator, String name) {
            super(mediator, name);
        }

        @Override
        public void send(String message) {
            System.out.println(name + " envía: " + message);
            mediator.sendMessage(message, this);
        }

        @Override
        public void receive(String message) {
            System.out.println(name + " recibe: " + message);
        }
    }

    // Cliente
    
        public static void main(String[] args) {
            ChatMediator chat = new ChatRoom();
            User user1 = new ChatUser(chat, "Alice");
            User user2 = new ChatUser(chat, "Bob");
            User user3 = new ChatUser(chat, "Charlie");
            chat.addUser(user1);
            chat.addUser(user2);
            chat.addUser(user3);
            user1.send("Hola a todos!"); // Bob y Charlie reciben el mensaje.
        }
        
}