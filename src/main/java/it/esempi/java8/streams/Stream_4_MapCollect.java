package it.esempi.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Stream_4_MapCollect {

    public static void main(String[] args) {
	System.out.println("================= USO DI MAP E COLLECT CON GLI STREAM ==================");

	List<User> users = Arrays.asList(new User(1, "user1@linksmt.it", "user1", "1234"),
		new User(2, "user2@linksmt.it", "user2", "4321"), new User(3, "user3@linksmt.it", "user3", "4567"));

	System.out.println("\nMappare un oggetto in un altro usando:");
	System.out.println("\n1) Java standard:");
	// 1. java standard
	List<UserDTO> listUserDTO = new ArrayList<>();
	for (User u : users) {
	    listUserDTO.addAll(Arrays.asList(new UserDTO(u.getId(), u.getEmail(), u.getUser())));
	}

	listUserDTO.forEach(System.out::println);

	// 2. stream().map() with anonymous class
	System.out.println("\n2) Stream map with anonymous class:");
	List<UserDTO> listUserDTO1 = users.stream().map(new Function<User, UserDTO>() {
	    @Override
	    public UserDTO apply(User u) {
		return new UserDTO(u.getId(), u.getEmail(), u.getUser());
	    }
	}).collect(Collectors.toList());

	listUserDTO1.forEach(System.out::println);

	// 3. stream().map() with lambda expression
	System.out.println("\n3) Stream map with lambda expression:");
	List<UserDTO> listUserDTO2 = users.stream().map((u) -> new UserDTO(u.getId(), u.getEmail(), u.getUser()))
		.collect(Collectors.toList());

	listUserDTO2.forEach(System.out::println);

    }

}

@AllArgsConstructor
@Getter
@Setter
class UserDTO {

    private int id;
    private String email;
    private String user;

    @Override
    public String toString() {
	return "User [id=" + id + ", email=" + email + ", user=" + user + "]";
    }

}

@AllArgsConstructor
@Getter
@Setter
class User {

    private int id;
    private String email;
    private String user;
    private String password;

    @Override
    public String toString() {
	return "User [id=" + id + ", email=" + email + ", user=" + user + ", password=" + password + "]";
    }

}
