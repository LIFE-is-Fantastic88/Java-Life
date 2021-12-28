
 class triangle {
	 private double side;
		public triangle(){
			side=0.0;
		}
		void setSide(double side1) {
			side=side1;
		}
		double getSide() {
			return side;
		}
		double getArea() {
			double num=(side*side)-Math.pow((side/2), 2);
			double line=Math.sqrt(num);
			return line*(side/2);
		}
		double getPerimeter() {
			return side*3;
		}
	}

