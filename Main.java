package cars1;

import java.util.List;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.JComboBox;

public class Main {

	public static void main(String[] args) {
		//create the frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String any = "any";
		//create the array of cars
		
		List <Cars> cars;
		Cars[] car = new Cars[150];
		Cars car1 = new Cars(150000, "Japan", "Acura", "Acura NSX 2017");
		Cars car2 = new Cars(10000, "Japan", "Acura", "Acura RSX-S 2004 Coupe");
		Cars car3 = new Cars(45000, "Italy", "Alfa Romeo", "Alfa Romeo Giulia Quadrofoglio");
		Cars car4 = new Cars(500000, "England", "Aston Martin", "Aston Martin DB5");
		Cars car5 = new Cars(125000, "England", "Aston Martin", "Aston Martin DB11");
		Cars car6 = new Cars(2500000, "England", "Aston Martin", "Aston Martin Vulcan");
		Cars car7 = new Cars(220000, "Germany", "Audi", "Audi R8 V10 Performance Coupe");
		Cars car8 = new Cars(70000, "Germany", "Audi", "Audi S5 Sportsback");
		Cars car9 = new Cars(135000, "Germany", "BMW", "BMW i8 Roadster");
		Cars car10 = new Cars(70000, "Germany", "BMW", "BMW Z4 M40i");
		Cars car11 = new Cars(82500, "Germany", "BMW", "BMW M4 2018");
		Cars car12 = new Cars(57000, "Germany", "BMW", "BMW M2 Competition");
		Cars car13 = new Cars(85000, "Germany", "BMW", "BMW M4 GTS 2016");
		Cars car14 = new Cars(350000, "Germany", "BMW", "BMW M3 E46 GTR 2006");
		Cars car15 = new Cars(90000, "Germany", "BMW", "BMW M4 Convertible");
		Cars car16 = new Cars(70000, "Germany", "BMW", "BMW i8 Coupe");
		Cars car17 = new Cars(25000, "Germany", "BMW", "BMW M3 E46");
		Cars car18 = new Cars(90000, "Germany", "BMW", "BMW M3 Evolution 1988");
		Cars car19 = new Cars(30000, "Germany", "BMW", "BMW M3 E90");
		Cars car20 = new Cars(80000, "Germany", "BMW", "BMW M5 2018");
		Cars car21 = new Cars(55000, "Germany", "BMW", "BMW X6 M 2016");
		Cars car22 = new Cars(30000, "USA", "Buick", "Buick Grand National 1987");
		Cars car23 = new Cars(50000, "USA", "Chevrolet", "Chevrolet Corvette ZR1 Coupe");
		Cars car24 = new Cars(52000, "USA", "Chevrolet", "Chevrolet Corvette Grand Sport 2017");
		Cars car25 = new Cars(35000, "USA", "Chevrolet", "Chevrolet Camaro SS 1967");
		Cars car26 = new Cars(32000, "USA", "Chevrolet", "Chevrolet Colorado ZR2 2017");
		Cars car27 = new Cars(50000, "USA", "Chevrolet", "Chevrolet Corvette Z06");
		Cars car28 = new Cars(25000, "USA", "Chevrolet", "Chevrolet Camaro Z28 2014");
		Cars car29 = new Cars(100000, "USA", "Chevrolet", "Chevrolet Bel Air 1955");
		Cars car30 = new Cars(40000, "USA", "Chevrolet", "Chevrolet C10 Stepside");
		Cars car31 = new Cars(78000, "USA", "Dodge", "Dodge Challenger SRT8");
		Cars car32 = new Cars(100000, "USA", "Dodge", "Dodge Charger 1967");
		Cars car33 = new Cars(80000, "USA", "Dodge", "Dodge Viper SRT");
		Cars car34 = new Cars(125000, "Italy", "Ferrari", "Ferrari Testarossa 1984");
		Cars car35 = new Cars(2600000, "Italy", "Ferrari", "Ferrari FXX-K Evo");
		Cars car36 = new Cars(350000, "Italy", "Ferrari", "Ferrari 488 Pista");
		Cars car37 = new Cars(200000, "Italy", "Ferrari", "Ferrari 458 Spider");
		Cars car38 = new Cars(150000, "Italy", "Ferrari", "Ferrari 458 Italia");
		Cars car39 = new Cars(770000, "Italy", "Ferrari", "Ferrari LaFerrari");
		Cars car40 = new Cars(1350000, "Italy", "Ferrari", "Ferrari F40 1988");
		Cars car41 = new Cars(350000, "Italy", "Ferrari", "Ferrari 488 GTB");
		Cars car42 = new Cars(40000, "USA", "Ford", "Ford F-150 Raptor");
		Cars car43 = new Cars(20000, "USA", "Ford", "Ford Focus RS");
		Cars car44 = new Cars(27000, "USA", "Ford", "Ford Mustang GT");
		Cars car45 = new Cars(70000, "USA", "Ford", "Ford Mustang 1965");
		Cars car46 = new Cars(100000, "USA", "Ford", "Ford Mustang BOSS 302 1969");
		Cars car47 = new Cars(500000, "USA", "Ford", "Ford GT 2017");
		Cars car48 = new Cars(25000, "USA", "Ford", "Fort Mustang Foxbody 1990");
		Cars car49 = new Cars(20000, "Japan", "Honda", "Honda S2000");
		Cars car50 = new Cars(60000, "Japan", "Honda", "NSX Type-R 1992");
		Cars car51 = new Cars(17000, "Japan", "Honda", "Honda Civic Type-R 2000");
		Cars car52 = new Cars(30000, "Japan", "Honda", "Honda Civic Type-R 2015");
		Cars car53 = new Cars(75000, "Japan", "Infiniti", "Infiniti Q60S");
		Cars car54 = new Cars(120000, "England", "Jaguar", "Jaguar F-Type R Convertible");
		Cars car55 = new Cars(110000, "England", "Jaguar", "Jaguar F-Type R Coupe");
		Cars car56 = new Cars(1500000, "Sweden", "Koenigsegg", "Koenigsegg Regera");
		Cars car57 = new Cars(549500, "Italy", "Lamborghini", "Lamborghini Countach");
		Cars car58 = new Cars(620000, "Italy", "Lamborghini", "Lamborghini Aventador SVJ Coupe");
		Cars car59 = new Cars(650000, "Italy", "Lamborghini", "Lamborghini Aventador SVJ Roadster");
		Cars car60 = new Cars(275000, "Italy", "Lamborghini", "Lamborghini Huracan Performante");
		Cars car61 = new Cars(300000, "Italy", "Lamborghini", "Lamborghini Huracan Performante Spyder");
		Cars car62 = new Cars(417000, "Italy", "Lamborghini", "Lamborghini Aventador S");
		Cars car63 = new Cars(460000, "Italy", "Lamborghini", "Lamborghini Aventador S Roadster");
		Cars car64 = new Cars(220000, "Italy", "Lamborghini", "Lamborghini Huracan Spyder");
		Cars car65 = new Cars(200000, "Italy", "Lamborghini", "Lamborghini Huracan");
		Cars car66 = new Cars(330000, "Italy", "Lamborghini", "Lamborghini Diablo SV");
		Cars car67 = new Cars(450000, "Italy", "Lamborghini", "Lamborghini Murcielago SV");
		Cars car68 = new Cars(50000, "England", "Land Rover", "Land Rover Defender 110");
		Cars car69 = new Cars(67000, "England", "Land Rover", "Land Rover Range Rover Sport SVR");
		Cars car70 = new Cars(65000, "England", "Lotus","Lotus Exige S");
		Cars car71 = new Cars(20000, "Japan", "Mazda","Mazda MX5 2015");
		Cars car72 = new Cars(12000, "Japan", "Mazda","Mazda MX5 1996");
		Cars car73 = new Cars(35000, "Japan", "Mazda","Mazda RX7 Spirit");
		Cars car74 = new Cars(400000, "England", "McLaren","McLaren 600 LT");
		Cars car75 = new Cars(280000, "England", "McLaren","McLaren P1 GTR");
		Cars car76 = new Cars(310000, "England", "McLaren","McLaren 570S");
		Cars car77 = new Cars(240000, "England", "McLaren","McLaren P1");
		Cars car78 = new Cars(370000, "England", "McLaren","McLaren 570S Spyder");
		Cars car79 = new Cars(110000, "Germany", "Mercedes","Mercedes-AMG C63 Coupe");
		Cars car80 = new Cars(200000, "Germany", "Mercedes","Mercedes-AMG GT R");
		Cars car81 = new Cars(240000, "Germany", "Mercedes","Mercedes-AMG GT S Roadster");
		Cars car82 = new Cars(250000, "Germany", "Mercedes","Mercedes-AMG G63");
		Cars car83 = new Cars(150000, "Germany", "Mercedes","Mercedes-AMG GT");
		Cars car84 = new Cars(50000, "Germany", "Mercedes","Mercedes-AMG A 45");
		Cars car85 = new Cars(60000, "USA", "Mercury","Mercury Cougar 1967");
		Cars car86 = new Cars(40000, "England", "Mini", "Mini Countryman John Cooper Works");
		Cars car87 = new Cars(45000, "Japan", "Mitsubishi", "Mitsubishi Lancer Evolution X");
		Cars car88 = new Cars(37500, "Japan", "Mitsubishi", "Mitsubishi Lancer Evolution 9");
		Cars car89 = new Cars(45000, "Japan", "Nissan", "Nissan 370Z 2018");
		Cars car90 = new Cars(99000, "Japan", "Nissan", "Nissan GT-R Nismo");
		Cars car91 = new Cars(60000, "Japan", "Nissan", "Nissan 370Z Nismo 2018");
		Cars car92 = new Cars(40000, "Japan", "Nissan", "Nissan Skyline GT-R R34");
		Cars car93 = new Cars(60000, "Japan", "Nissan", "Nissan GT-R R35");
		Cars car94 = new Cars(20000, "Japan", "Nissan", "Nissan 180SX Type X 1996");
		Cars car95 = new Cars(15000, "Japan", "Nissan", "Nissan 350Z");
		Cars car96 = new Cars(54000, "Japan", "Nissan", "Nissan Skyline GT-R V-Spec");
		Cars car97 = new Cars(43000, "Japan", "Nissan", "Nissan Fairlady 240ZG 1971");
		Cars car98 = new Cars(25000, "Japan", "Nissan", "Nissan Skyline GT-R R32");
		Cars car99 = new Cars(30000, "Japan", "Nissan", "Nissan Silvia Sper-R Aero");
		Cars car100 = new Cars(47000, "Japan", "Nissan", "Nissan Skyline 2000 GT-R 1971");
		Cars car101 = new Cars(2400000, "Italy", "Pagani", "Pagani Huayra BC");
		Cars car102 = new Cars(70000, "USA", "Plymouth", "Plymouth Barracuda");
		Cars car103 = new Cars(160000, "Sweden", "Polestar", "Polestar Polestar 1 2020");
		Cars car104 = new Cars(69500, "USA", "Pontiac", "Pontiac Firebird");
		Cars car105 = new Cars(145000, "Germany", "Porsche", "Porsche 911 GT3 RS");
		Cars car106 = new Cars(83000, "Germany", "Porsche", "Porsche Cayman GT4");
		Cars car107 = new Cars(105000, "Germany", "Porsche", "Porsche 911 GT2 RS");
		Cars car108 = new Cars(90000, "Germany", "Porsche", "Porsche 911 Carrera GTS");
		Cars car109 = new Cars(97000, "Germany", "Porsche", "Porsche 911 Carrera GTS Cabriolet");
		Cars car110 = new Cars(117000, "Germany", "Porsche", "Porsche Targa 4 GTS");
		Cars car111 = new Cars(60000, "Germany", "Porsche", "Porsche 718 Cayman GTS");
		Cars car112 = new Cars(60000, "Germany", "Porsche", "Porsche 911 Turbo S");
		Cars car113 = new Cars(71000, "Germany", "Porsche", "Porsche 911 Turbo S Cabriolet");
		Cars car114 = new Cars(2000000, "Germany", "Porsche", "Porsche 911 Carrera RSR 2.8");
		Cars car115 = new Cars(40000, "Germany", "Porsche", "Porsche 911 Carrera S 1996");
		Cars car116 = new Cars(1500000, "Germany", "Porsche", "Porsche 918 Spyder");
		Cars car117 = new Cars(130000, "Germany", "Porsche", "Porsche Panamera Turbo S");
		Cars car118 = new Cars(950000, "Germany", "Porsche", "Porsche Carrera GT");
		Cars car119 = new Cars(33000, "Japan", "Subaru", "Subaru BRZ Premium");
		Cars car120 = new Cars(20000, "Japan", "Subaru", "Subaru Imprezza WRX STI");
		Cars car121 = new Cars(13200, "Germany", "Volkswagen", "Volkswagen Beetle");
		Cars car122 = new Cars(17000, "Germany", "Volkswagen", "Volkswagen Golf GTI 2016");
		Cars car123 = new Cars(30000, "Germany", "Volkswagen", "Volkswagen Golf GTI 1976");
		Cars car124 = new Cars(17000, "Sweden", "Volvo", "Volvo Amazon P130");
		Cars car125 = new Cars(16000, "Sweden", "Volvo", "Volvo 242 Dl Sedan");
		Cars.cars=Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, 
								car11, car12, car13, car14, car15, car16, car17, car18, car19, car20,
								car21, car22, car23, car24, car25, car26, car27, car28, car29, car30,
								car31, car32, car33, car34, car35, car36, car37, car38, car39, car40,
								car41, car42, car43, car44, car45, car46, car47, car48, car49, car50,
								car51, car52, car53, car54, car55, car56, car57, car58, car59, car60,
								car61, car62, car63, car64, car65, car66, car67, car68, car69, car70,
								car71, car72, car73, car74, car75, car76, car77, car78, car79, car80,
								car81, car82, car83, car84, car85, car86, car87, car88, car89, car90,
								car91, car92, car93, car94, car95, car96, car97, car98, car99, car100,
								car101, car102, car103, car104, car105, car106, car107, car108, car109, car110,
								car111, car112, car113, car114, car115, car116, car117, car118, car119, car120,
								car121, car122, car123, car124, car125);
		
		
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		
		//create the top panel
		JPanel topPanel = new JPanel();
		mainPanel.add(topPanel);
		
		JLabel topLabel = new JLabel("Sports cars dealership");
		topLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		topPanel.add(topLabel);
		
		//create the middle panel and split it vertically
		JPanel middlePanel = new JPanel();
		mainPanel.add(middlePanel);
		middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.X_AXIS));
		
		//create left middle panel and fill it
		JPanel leftMiddlePanel = new JPanel();
		middlePanel.add(leftMiddlePanel);
		leftMiddlePanel.setLayout(new BoxLayout(leftMiddlePanel, BoxLayout.Y_AXIS));
		
		JLabel topGreetingsLabel = new JLabel("Here you can find your dream car and see its worth");
		leftMiddlePanel.add(topGreetingsLabel);
		topGreetingsLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		JLabel bottomGreetingsLabel = new JLabel("We have gathered the best offers from all around the world");
		leftMiddlePanel.add(bottomGreetingsLabel);
		bottomGreetingsLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		JLabel warningLabel1 = new JLabel("Note: depending on where you live, delivery may take up to 3 months");
		leftMiddlePanel.add(warningLabel1);
		warningLabel1.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		JLabel warningLabel2 = new JLabel("Note: There may be import costs");
		leftMiddlePanel.add(warningLabel2);
		warningLabel2.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		//create right middle panel and fill it
		JPanel rightMiddlePanel = new JPanel();
		middlePanel.add(rightMiddlePanel);
		rightMiddlePanel.setLayout(new BoxLayout(rightMiddlePanel, BoxLayout.Y_AXIS));
		
		JLabel priceMargineLabel = new JLabel("First select the price margine");
		priceMargineLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		rightMiddlePanel.add(priceMargineLabel);
		
		//create a panel oriented horizontally with the from to fields
		JPanel fromToPanel = new JPanel();
		rightMiddlePanel.add(fromToPanel);
		fromToPanel.setLayout(new BoxLayout(fromToPanel, BoxLayout.X_AXIS));
		
		JLabel fromLabel = new JLabel("From:");
		fromToPanel.add(fromLabel);
		fromLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		JTextField fromTextField = new JTextField();
		fromToPanel.add(fromTextField);
		
		JLabel toLabel = new JLabel("To:");
		fromToPanel.add(toLabel);
		toLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		JTextField toTextField = new JTextField();
		fromToPanel.add(toTextField);
		
		JLabel countryLabel = new JLabel("Then enter the country of manufacture");
		rightMiddlePanel.add(countryLabel);
		countryLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		//create the array of countries
		String[] countries = {"Any", "England", "Germany", "Italy",
				 "Japan", "Sweden", "USA"};
		
		JComboBox countryComboBox = new JComboBox(countries);
		rightMiddlePanel.add(countryComboBox);
		
		JLabel brandLabel = new JLabel("Finally, select the brand");
		rightMiddlePanel.add(brandLabel);
		brandLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		
		//create the array of brands
		String[] brands = {"Any", "Acura", "Alfa Romeo", "Aston Martin", "Audi", 
				"BMW", "Buick", "Chevrolet", "Dodge", "Ferrari", "Ford", "Honda", 
				"Infiniti", "Jaguar", "Koenigsegg", "Lamborghini", "Land Rover", 
				"Lotus", "Mazda", "McLaren", "Mercedes", "Mercury", "Mini", "Mitsubishi",
				"Nissan", "Pagani", "Plymouth", "Polestar", "Pontiac", "Porsche", 
				"Subaru", "Volkswagen", "Volvo"};
		
		JComboBox brandsComboBox = new JComboBox(brands);
		rightMiddlePanel.add(brandsComboBox);
	
		//create the bottom panel and add the search button and txtarea in
		JPanel bottomPanel = new JPanel();
		mainPanel.add(bottomPanel);
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
		
		JButton searchButton = new JButton("Search");
		
		//create the txtarea for the results
		JTextArea txtarea = new JTextArea(); 
			txtarea.setRows(25);
			txtarea.setColumns(25);
		    txtarea.setWrapStyleWord(true);
		    txtarea.setBackground(Color.LIGHT_GRAY);
		    txtarea.setFont(new Font("Verdana", Font.PLAIN, 15));
	    JScrollPane scroll = new JScrollPane (txtarea);
	    bottomPanel.add(scroll);
		
	    //give the search button functionality
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int from = 0;
				if(!fromTextField.getText().isEmpty()) {
					from = Integer.parseInt(fromTextField.getText());
					}
				int to = 0;
				if(!toTextField.getText().isEmpty()) {
					to = Integer.parseInt(toTextField.getText());
					}
				String country = countryComboBox.getSelectedItem().toString();
				String brand = brandsComboBox.getSelectedItem().toString();
				
				String text = "";
				for(Cars cars : Cars.cars) {
					if((cars.getPrice() >= from || fromTextField.getText().isEmpty()) && (cars.getPrice() <= to || toTextField.getText().isEmpty())) {
						if(cars.getCountry().equalsIgnoreCase(country) || country.equalsIgnoreCase(any)) {
							if(cars.getBrand().equalsIgnoreCase(brand)|| brand.equalsIgnoreCase(any)) {
								
								text += cars.getName() + "\n";
								text += "Price: " + cars.getPrice() + "$ \n";
								text += "Country of manufacture: " + cars.getCountry() + " \n";
								text += "Manufacturer: " + cars.getBrand()+ "\n";
								text += "\n";
 								
							}
						}
					}
				}
				if(text.equals("")) {
					text+= "No results have been found";
				}
				txtarea.setText(text);
			}
		});
		bottomPanel.add(searchButton);
		
		frame.pack();
		frame.setVisible(true);

	}

}
