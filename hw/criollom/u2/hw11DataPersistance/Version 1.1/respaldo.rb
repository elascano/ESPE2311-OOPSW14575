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
      puts "#{index + 1}. #{tire}"
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

# Method to obtain user input
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

# Save Car object to JSON file
def save_to_json(car, filename)
  File.open(filename, 'w') { |file| file.write(car.to_json) }
end

# Load Car object from JSON file
def load_from_json(filename)
  json_data = File.read(filename)
  Car.from_json(json_data)
end

# Get user input and create a Car object
car = get_car_data

# Save Car object to a JSON file
save_to_json(car, 'car_data.json')
puts "Car data saved to 'car_data.json'."

# Load Car object from the JSON file and display information
loaded_car = load_from_json('car_data.json')
puts "\nLoaded Car Information:"
loaded_car.display_information
