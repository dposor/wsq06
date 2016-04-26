public class FinnNumber{
	int myNumber;
	
	public FinnNumber(int i) {
		this.myNumber = i;
	}	
	
	public int giveValue(){
		return myNumber;
	}
	
	public FinnNumber gcd(FinnNumber b){		
		if(b.giveValue()==0){
			//System.out.println("Wir sind bei 0 angekommen.");
			return this;
		}
		else{
			if(this.giveValue()>b.giveValue()){
				//System.out.println("Erste Nummer: " + this.giveValue() + ", zweite Nummer: " + b.giveValue() + ", Rest: " + this.giveValue()%b.giveValue());
				FinnNumber interRes = new FinnNumber(this.giveValue()%b.giveValue());
				return b.gcd(interRes);
			}
			else{
				//System.out.println("Erste Nummer: " + this.giveValue() + ", zweite Nummer: " + b.giveValue() + ", Rest: " + b.giveValue()%this.giveValue());
				FinnNumber interRes = new FinnNumber(b.giveValue()%this.giveValue());
				return b.gcd(interRes);
			}
		}
	}
}
