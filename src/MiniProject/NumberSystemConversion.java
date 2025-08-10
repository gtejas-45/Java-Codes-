package MiniProject;

import java.util.Scanner;

public class NumberSystemConversion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== Number System Converter =====");
                System.out.println("1. Decimal to Binary");
                System.out.println("2. Decimal to Octal");
                System.out.println("3. Decimal to Hexadecimal");
                System.out.println("4. Binary to Decimal");
                System.out.println("5. Binary to Octal");
                System.out.println("6. Binary to Hexadecimal");
                System.out.println("7. Octal to Decimal");
                System.out.println("8. Octal to Binary");
                System.out.println("9. Octal to Hexadecimal");
                System.out.println("10. Hexadecimal to Decimal");
                System.out.println("11. Hexadecimal to Binary");
                System.out.println("12. Hexadecimal to Octal");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // Clear buffer

                switch (choice) {
                    case 1:
                        System.out.print("Enter Decimal number: ");
                        int dec1 = sc.nextInt();
                        System.out.println("Binary: " + Integer.toBinaryString(dec1));
                        break;

                    case 2:
                        System.out.print("Enter Decimal number: ");
                        int dec2 = sc.nextInt();
                        System.out.println("Octal: " + Integer.toOctalString(dec2));
                        break;

                    case 3:
                        System.out.print("Enter Decimal number: ");
                        int dec3 = sc.nextInt();
                        System.out.println("Hexadecimal: " + Integer.toHexString(dec3).toUpperCase());
                        break;

                    case 4:
                        System.out.print("Enter Binary number: ");
                        String bin1 = sc.nextLine();
                        try {
                            int dec4 = Integer.parseInt(bin1, 2);
                            System.out.println("Decimal: " + dec4);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Binary Number");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Binary number: ");
                        String bin2 = sc.nextLine();
                        try {
                            int dec5 = Integer.parseInt(bin2, 2);
                            System.out.println("Octal: " + Integer.toOctalString(dec5));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Binary Number");
                        }
                        break;

                    case 6:
                        System.out.print("Enter Binary number: ");
                        String bin3 = sc.nextLine();
                        try {
                            int dec6 = Integer.parseInt(bin3, 2);
                            System.out.println("Hexadecimal: " + Integer.toHexString(dec6).toUpperCase());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Binary Number");
                        }
                        break;

                    case 7:
                        System.out.print("Enter Octal number: ");
                        String oct1 = sc.nextLine();
                        try {
                            int dec7 = Integer.parseInt(oct1, 8);
                            System.out.println("Decimal: " + dec7);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Octal Number");
                        }
                        break;

                    case 8:
                        System.out.print("Enter Octal number: ");
                        String oct2 = sc.nextLine();
                        try {
                            int dec8 = Integer.parseInt(oct2, 8);
                            System.out.println("Binary: " + Integer.toBinaryString(dec8));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Octal Number");
                        }
                        break;

                    case 9:
                        System.out.print("Enter Octal number: ");
                        String oct3 = sc.nextLine();
                        try {
                            int dec9 = Integer.parseInt(oct3, 8);
                            System.out.println("Hexadecimal: " + Integer.toHexString(dec9).toUpperCase());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Octal Number");
                        }
                        break;

                    case 10:
                        System.out.print("Enter Hexadecimal number: ");
                        String hex1 = sc.nextLine();
                        try {
                            int dec10 = Integer.parseInt(hex1, 16);
                            System.out.println("Decimal: " + dec10);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Hexadecimal Number");
                        }
                        break;

                    case 11:
                        System.out.print("Enter Hexadecimal number: ");
                        String hex2 = sc.nextLine();
                        try {
                            int dec11 = Integer.parseInt(hex2, 16);
                            System.out.println("Binary: " + Integer.toBinaryString(dec11));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Hexadecimal Number");
                        }
                        break;

                    case 12:
                        System.out.print("Enter Hexadecimal number: ");
                        String hex3 = sc.nextLine();
                        try {
                            int dec12 = Integer.parseInt(hex3, 16);
                            System.out.println("Octal: " + Integer.toOctalString(dec12));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Hexadecimal Number");
                        }
                        break;

                    case 0:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select a valid option.");
                }

            } while (choice != 0);

            sc.close();
        }
    }

