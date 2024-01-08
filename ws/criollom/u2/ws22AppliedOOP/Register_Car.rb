require_relative 'Car.rb'


puts "Welcome to System Register to car"
print "Register brand: "
brand = gets.chomp

print "Register model: "
model = gets.chomp

print "Register color: "
color = gets.chomp

# Obtener datos para el motor
print "Register type of motor: "
motor_marca = gets.chomp

# Obtener datos para las llantas
llantas = []
4.times do |i|
  print "Register diameter of wheel ##{i + 1}: "
  diametro = gets.chomp.to_i

  print "Rgeister type of wheel ##{i + 1}: "
  marca = gets.chomp

  llantas << Wheel.new(diametro, marca)
end

# Crear y devolver un nuevo objeto Carro con los datos ingresados
car=Car.new(brand, model, color, llantas, Engine.new(motor_marca))

car.mostrar_informacion
puts "nueva cosa"
puts car.engine
