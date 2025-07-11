package com.tss.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.tss.model.Movie;
import com.tss.model.MovieStoreEmptyException;
import com.tss.model.MovieStoreFullException;

public class MovieApp {
	static ArrayList<Movie> movies = new ArrayList<>();
	static final int MAX_MOVIES = 5;
	static final String FILE_NAME = "movies.json";

	public static void main(String[] args) {

		loadFromFile();

		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean loop = true;

		while (loop) {
			System.out.println("\n--- Movie Store ---");
			System.out.println("1. Display movies");
			System.out.println("2. Add movie");
			System.out.println("3. Delete movie");
			System.out.println("4. Clear all");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				displayMovies();
				break;
			case 2:
				addMovies(scanner);
				break;
			case 3:
				deleteMovies(scanner);
				break;
			case 4:
				clearAll();
				break;
			case 5:
				System.out.println("Saving and exiting...");
				saveToFile();
				loop = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		scanner.close();
	}

	private static void clearAll() {
		movies.clear();
		saveToFile();
		System.out.println("Movie Store Cleared!!");
	}

	private static void deleteMovies(Scanner scanner) {
		System.out.print("Enter movie ID to delete: ");
		String id = scanner.nextLine();

		Iterator<Movie> it = movies.iterator();
		boolean found = false;
		while (it.hasNext()) {
			if (it.next().getId().equalsIgnoreCase(id)) {
				it.remove();
				found = true;
				System.out.println("Movie deleted.");
				saveToFile();
				break;
			}
		}
		if (!found) {
			System.out.println("Movie ID not found.");
		}
	}

	private static void addMovies(Scanner scanner) {
		try {
			if (movies.size() >= MAX_MOVIES) {
				throw new MovieStoreFullException();
			}
			System.out.print("Enter movie name: ");
			String name = scanner.nextLine();
			System.out.print("Enter movie genre: ");
			String genre = scanner.nextLine();
			System.out.print("Enter movie year: ");
			int year = scanner.nextInt();
			scanner.nextLine();
			String id = generateId(name, genre, year);
			movies.add(new Movie(id, name, genre, year));
			saveToFile();
			System.out.println("Movie added with ID: " + id);
		} catch (MovieStoreFullException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String generateId(String name, String genre, int year) {
		String namePart = name.length() >= 2 ? name.substring(0, 2) : name;
		String genrePart = genre.length() >= 2 ? genre.substring(0, 2) : genre;
		String yearPart = String.valueOf(year);
		yearPart = yearPart.length() >= 2 ? yearPart.substring(yearPart.length() - 2) : yearPart;

		return namePart + genrePart + yearPart;
	}

	private static void displayMovies() {
		try {
			if (movies.isEmpty()) {
				throw new MovieStoreEmptyException();
			}
			for (Movie movie : movies) {
				System.out.println(movie.toString());
			}
		} catch (MovieStoreEmptyException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void saveToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(movies);
		} catch (IOException e) {
			System.out.println("Error saving to file: " + e.getMessage());
		}
	}

	private static void loadFromFile() {
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			return;
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			movies = (ArrayList<Movie>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading from file: " + e.getMessage());
		}
	}
}
