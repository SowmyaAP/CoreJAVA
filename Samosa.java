class Samosa{

float cost;
boolean taste;
Samosasize size;
String[] ingredients;

Samosa(float cost, boolean taste)
{
this.cost=cost;
this.taste=taste;


}
Samosa(Samosasize size,String[] ingredients){
this.size=size;
this.ingredients=ingredients;

}
Samosa(float cost,boolean taste,Samosasize size,String[] ingredients)
{
          this(cost,taste);
}
}