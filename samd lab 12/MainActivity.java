package com.example.saschpe.socialfragment.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saschpe.socialfragment.R
import kotlinx.android.synthetic.main.activity_main.*
import saschpe.android.socialfragment.app.SocialFragment

@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 Configuration config = getResources().getConfiguration();
 
 FragmentManager fragmentManager = getFragmentManager();
 FragmentTransaction fragmentTransaction = 
 fragmentManager.beginTransaction();
 
if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
 
 LM_Fragment lm_fragment = new LM_Fragment();
 fragmentTransaction.replace(android.R.id.content, lm_fragment);
 }else {
 
 PM_Fragment pm_fragment = new PM_Fragment();
 fragmentTransaction.replace(android.R.id.content, pm_fragment);
 }
 fragmentTransaction.commit();
 }
 public View onCreateView(LayoutInflater inflater, ViewGroup container,
 Bundle savedInstanceState) {
 View rootView = inflater.inflate(R.layout.lm_fragment, 
container,false);
 //Inflate the layout for this fragment
edAmount = (EditText) rootView.findViewById(R.id.amount);
 edYears = (EditText) rootView.findViewById(R.id.years);
 edRate = (EditText) rootView.findViewById(R.id.rate);
 edButton = (Button) rootView.findViewById(R.id.getActivity);
 resulTotal = (TextView)rootView.findViewById(R.id.total);
 edButton.setOnClickListener(new OnClickListener() {
 @Override
public void onClick(View arg0) {
 Intent intent = new
Intent(getActivity(),AnotherActivity.class);
 intent.putExtra("x", edAmount.getText().toString());
 intent.putExtra("y", edYears.getText().toString());
 intent.putExtra("z", edRate.getText().toString());
 startActivityForResult(intent, 5555);
 }
 });
 return rootView;
 }
@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
 if(resultCode == 5555){
 resulTotal.setText("Total Result is = " + 
data.getStringExtra("sumTotal"));
 }
 }
