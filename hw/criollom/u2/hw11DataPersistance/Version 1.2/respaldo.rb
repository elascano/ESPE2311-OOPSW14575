require 'json'

class Engine
  attr_accessor :brand

  def initialize(brand)
    @brand = brand
  end

  def to_s
    "Engine: #{brand}"
  end
end

class Tire
  attr_accessor :diameter, :brand

  def initialize(diameter, brand)
    @diameter = diameter
    @brand = brand
  end

  def to_s
    "#{brand} - Diameter: #{diameter}"
  end
end

class Car
  attr_accessor :brand, :model, :color, :tires, :engine

  def initialize(brand, model, color, tires, engine)
    @brand = brand
    @model = model
    @color = color
    @tires = tires
    @engine = engine
  end

  def display_information
    puts "Car Information:"
    puts "Brand: #{brand}"
    puts "Model: #{model}"
    puts "Color: #{color}"
    puts "Tires:"
    tires.each_with_index do |tire, index|
      puts "#{index + 1}. Diameter: #{tire.diameter}, Brand: #{tire.brand}"
    end
    puts engine
  end

  def to_json
    {
      brand: brand,
      model: model,
      color: color,
      tires: tires.map { |tire| { diameter: tire.diameter, brand: tire.brand } },
      engine: { brand: engine.brand }
    }.to_json
  end

  def self.from_json(json)
    data = JSON.parse(json)
    tires = data['tires'].map { |tire_data| Tire.new(tire_data['diameter'], tire_data['brand']) }
    engine = Engine.new(data['engine']['brand'])
    new(data['brand'], data['model'], data['color'], tires, engine)
  end
end

# Método para obtener datos del usuario
def get_car_data
  print "Enter the car brand: "
  brand = gets.chomp

  print "Enter the car model: "
  model = gets.chomp

  print "Enter the car color: "
  color = gets.chomp

  # Obtain engine details
  print "Enter the engine brand: "
  engine_brand = gets.chomp

  # Obtain tire details
  tires = []
  4.times do |i|
    print "Enter the diameter of tire ##{i + 1}: "
    diameter = gets.chomp.to_i

    print "Enter the brand of tire ##{i + 1}: "
    tire_brand = gets.chomp

    tires << Tire.new(diameter, tire_brand)
  end

  # Create and return a new Car object with the entered data
  Car.new(brand, model, color, tires, Engine.new(engine_brand))
end

# Método para guardar el objeto Car en un archivo JSON
def save_to_json(car, filename)
  File.open(filename, 'a') { |file| file.write(car.to_json) }
  File.close
end

# Método para cargar el objeto Car desde un archivo JSON
def load_from_json(filename)
  json_data = File.read(filename)
  Car.from_json(json_data)
end

# Bucle principal del programa
cars = []

loop do
  puts "\nMenu Options:"
  puts "1. Enter Car Data"
  puts "2. Save Car Data"
  puts "3. Load Car Data"
  puts "4. Display Car Information"
  puts "5. Exit"
  print "Enter your choice (1-5): "
  option = gets.chomp.to_i

  case option
  when 1
    # Obtener datos del automóvil y agregarlo a la lista de automóviles
    car = get_car_data
    cars << car
  when 2
    # Guardar el último automóvil ingresado en un archivo JSON
    save_to_json(cars.last, 'car_data.json')
    puts "Car data saved to 'car_data.json'."
  when 3
    # Cargar un automóvil desde un archivo JSON
    loaded_car = load_from_json('car_data.json')
    cars << loaded_car
    puts "Car data loaded from 'car_data.json'."
  when 4
    # Mostrar la información del último automóvil ingresado
    cars.last&.display_information
  when 5
    # Salir del bucle y finalizar el programa
    puts "Exiting the program."
    break
  else
    puts "Invalid option. Please enter a number between 1 and 5."
  end
end
