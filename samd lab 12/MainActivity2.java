TextView tvSum;
float resultFinal =0 ;
 Button back;
 @Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.another_activity);
 Intent intent = getIntent();
 
int x = Integer.parseInt(intent.getStringExtra("x"));
 int y = Integer.parseInt(intent.getStringExtra("y"));
 int z = Integer.parseInt(intent.getStringExtra("z"));
 //result = x+y + z;
 Float divided = (float) (x/y);
 int count = 0;
 StringBuffer result = new StringBuffer();
 
for(int i=y;i>0;i--){
 count++;
 Float interest = (Float) (divided * i) * ((float) z/100);
 Float toBePayed = divided+interest;
 resultFinal += toBePayed;
 result.append("Year "+count+": $"+Float.toString(toBePayed)+ ", 
Interest :" +interest+'\n');
 }
 
tvSum = (TextView) findViewById(R.id.data);
 back = (Button) findViewById(R.id.getBack);
 tvSum.setText(result);
 
back.setOnClickListener(new OnClickListener() {
 @Override
public void onClick(View arg0) {
 Intent returnIntent = new Intent();
 returnIntent.putExtra("sumTotal",Float.toString(resultFinal));
 setResult(5555,returnIntent); 
 finish();
 }
 });
 }
