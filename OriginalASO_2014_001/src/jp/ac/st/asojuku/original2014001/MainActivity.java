package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンをIDで探してボタン変数を作る
		Button btnOK =(Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v)
	{
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId())
		{   //どのボタンが押されたか判定
			case R.id.btnOK: //btnMsgが押された
			//エディットテキストから入力内容を取り出す
				EditText etv = (EditText)findViewById(R.id.edtName);
				String inputMsg = etv.getText().toString();
				
				//Randomクラスのインスタンスを作る
				Random rnd = new Random();
				//0～から3の4パターンの数字をranに取得
				int ran = rnd.nextInt(4);
				
				Intent intent = null;
				
				switch(ran)
				{
					case 0:
					intent = new Intent(MainActivity.this,DaikichiActivity.class);
					startActivity(intent);
					break;
					
					case 1:
					intent = new Intent(MainActivity.this,CyukichiActivity.class);
					startActivity(intent);
					break;
					
					case 2:
					intent = new Intent(MainActivity.this,KichiActivity.class);
					startActivity(intent);
					break;
					
					case 4:
					intent = new Intent(MainActivity.this,KyouActivity.class);
					startActivity(intent);
					break;
					
				}
		}
	}
		
	

}
