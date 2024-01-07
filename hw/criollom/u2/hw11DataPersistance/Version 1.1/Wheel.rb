class Wheel
  attr_accessor :diameter, :type

  def initialize(diameter, type)
    @diameter = diameter
    @type = type
  end

  def to_s
    "#{type} - Diametro: #{diameter}"
  end
end
