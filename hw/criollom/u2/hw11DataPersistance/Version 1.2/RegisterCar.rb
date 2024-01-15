require_relative 'Car.rb'
require 'json'

def get_car_data
  print "Enter the car brand: "
  brand = gets.chomp

  print "Enter the car model: "
  model = gets.chomp

  print "Enter the car color: "
  color = gets.chomp

  # Obtener detalles del motor
  print "Enter the engine brand: "
  engine_brand = gets.chomp

  # Obtener detalles de los neumáticos
  tires = []
  4.times do |i|
    print "Enter the diameter of tire ##{i + 1}: "
    diameter = gets.chomp.to_i

    print "Enter the brand of tire ##{i + 1}: "
    tire_brand = gets.chomp

    tires << Tire.new(diameter, tire_brand)
  end

  # Crear y devolver un nuevo objeto Car con los datos ingresados
  Car.new(brand, model, color, tires, Engine.new(engine_brand))
end

# Guardar objeto Car en un archivo JSON
def save_to_json(car, filename)
  existing_data = load_all_from_json(filename)
  existing_data << JSON.parse(car.car_to_json)

  File.open(filename, 'w') do |file|
    file.puts existing_data.to_json
  end

  puts "Car data saved to '#{filename}'."
end

# Cargar todos los objetos Car desde un archivo JSON
def load_all_from_json(filename)
  begin
    json_data = File.read(filename)
    JSON.parse(json_data)
  rescue JSON::ParserError => e
    puts "Error al cargar el archivo JSON: #{e.message}"
    []
  end
end

# Menú principal
def menu
  loop do
    puts "\nMenu:"
    puts "1. Registrar un carro"
    puts "2. Mostrar carros"
    puts "3. Salir"
    print "Selecciona una opción: "
    choice = gets.chomp.to_i

    case choice
    when 1
      car = get_car_data
      save_to_json(car, 'car_data.json')
    when 2
      cars = load_all_from_json('car_data.json')
      puts "\nCarros registrados:"
      cars.each_with_index do |car, index|
        car_obj = Car.from_json(car.to_json)
        puts "#{index + 1}. #{car_obj.brand} - #{car_obj.model} (Color: #{car_obj.color})"
        car_obj.display_information
      end
    when 3
      puts "¡Hasta luego!"
      break
    else
      puts "Opción no válida. Inténtalo de nuevo."
    end
  end
end

# Iniciar el programa
menu
