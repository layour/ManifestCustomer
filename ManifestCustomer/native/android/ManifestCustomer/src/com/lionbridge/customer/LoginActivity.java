package com.lionbridge.customer;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class LoginActivity extends UMWindowActivity {

	protected UMWindow Login = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label3 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout panel3 = null;
protected UMImageButton imagebutton0 = null;
protected UMTextbox textbox0 = null;
protected UMImageButton imagebutton1 = null;
protected XHorizontalLayout panel4 = null;
protected UMImageButton imagebutton3 = null;
protected UMPassword textbox1 = null;
protected UMImageButton imagebutton2 = null;
protected XHorizontalLayout panel5 = null;
protected UMSwitch switch0 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected XVerticalLayout panel2 = null;

	
	protected final static int ID_LOGIN = 1460387954;
protected final static int ID_VIEWPAGE0 = 1832636984;
protected final static int ID_PANEL0 = 315012535;
protected final static int ID_LABEL3 = 835017715;
protected final static int ID_PANEL1 = 969582998;
protected final static int ID_PANEL3 = 1258835262;
protected final static int ID_IMAGEBUTTON0 = 1209122491;
protected final static int ID_TEXTBOX0 = 1060046976;
protected final static int ID_IMAGEBUTTON1 = 476161843;
protected final static int ID_PANEL4 = 456285687;
protected final static int ID_IMAGEBUTTON3 = 1665390726;
protected final static int ID_TEXTBOX1 = 2104468723;
protected final static int ID_IMAGEBUTTON2 = 1888683921;
protected final static int ID_PANEL5 = 900287102;
protected final static int ID_SWITCH0 = 1712933407;
protected final static int ID_LABEL0 = 254503314;
protected final static int ID_BUTTON0 = 1126110193;
protected final static int ID_PANEL6 = 422323326;
protected final static int ID_LABEL1 = 819016632;
protected final static int ID_LABEL2 = 1056135214;
protected final static int ID_PANEL2 = 449879337;

	
	
	@Override
	public String getControllerName() {
		return "LoginController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.lionbridge.customer";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("Login",ID_LOGIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("imagebutton3",ID_IMAGEBUTTON3);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel2",ID_PANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		
	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","CENTER"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","狮桥超级车队"
,"halign","center"
,"height","wrap"
,"widthwrap","162.0"
,"color","#d68f2f"
,"heightwrap","37.0"
,"layout-type","linear"
,"font-size","26"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel0.addView(label3);

return panel0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"margin-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-left","10"
,"margin-top","10"
,"valign","center"
,"background-image","textboxbg.png"
);
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","signin_head.png"
,"value","图标名称"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel3.addView(imagebutton0);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"halign","LEFT"
,"height","44"
,"weight","1"
,"maxlength","256"
,"color","#a6a6a6"
,"placeholder","请输入手机号"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
);
panel3.addView(textbox0);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
,"halign","center"
,"width","44"
,"icon-width","20"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","20"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","signin_delete.png"
,"value","图标名称"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel3.addView(imagebutton1);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"margin-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-left","10"
,"margin-bottom","5"
,"margin-top","5"
,"valign","center"
,"background-image","textboxbg.png"
);
imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON3
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","signin_cipher.png"
,"value","图标名称"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel4.addView(imagebutton3);
textbox1 = (UMPassword)ThirdControl.createControl(new UMPassword(context),ID_TEXTBOX1
,"halign","LEFT"
,"height","44"
,"weight","1"
,"maxlength","256"
,"color","#a6a6a6"
,"placeholder","请输入密码"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
);
panel4.addView(textbox1);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
,"halign","center"
,"width","44"
,"icon-width","20"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","20"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","signin_delete.png"
,"value","图标名称"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel4.addView(imagebutton2);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"margin-right","10"
,"halign","RIGHT"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-left","10"
,"valign","center"
);
switch0 = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCH0
,"height","32"
,"layout-type","linear"
,"background","#167ef8"
,"width","51"
,"value","on"
);
panel5.addView(switch0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"widthwrap","60.0"
,"width","wrap"
,"content","自动登录"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel5.addView(label0);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"margin-right","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-left","10"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","立即注册"
,"halign","left"
,"height","40"
,"weight","1"
,"color","#83533c"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel6.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","忘记密码"
,"halign","right"
,"height","40"
,"weight","1"
,"color","#83533c"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel6.addView(label2);

return panel6;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"margin-right","10"
,"halign","center"
,"height","250"
,"border-radius","15"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-left","10"
,"valign","TOP"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel1.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel1.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel1.addView(panel5);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"border-bottom-width","1"
,"font-pressed-color","#00a1ea"
,"margin-right","10"
,"height","44"
,"border-right-color","#ec5f1a"
,"font-size","20"
,"value","登录"
,"border-right-width","1"
,"border-left-width","1"
,"halign","center"
,"border-radius","5"
,"width","fill"
,"margin-bottom","5"
,"border-bottom-color","#ec5f1a"
,"border-top-width","1"
,"border-left-color","#ec5f1a"
,"border-top-color","#ec5f1a"
,"color","#ffffff"
,"layout-type","linear"
,"background","#ec5f1a"
,"margin-left","10"
,"onclick","action:button0_onclick"
,"font-family","default"
,"margin-top","5"
,"valign","center"
);
panel1.addView(button0);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup);
panel1.addView(panel6);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
,"background-image","sudoku_dandelionbg.png"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
viewPage0.addView(panel1);
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","TOP"
);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Login = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_LOGIN
,"halign","center"
,"height","520"
,"layout","vbox"
,"width","fill"
,"controller","LoginController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Login.addView(viewPage0);

return (UMWindow)Login;
}

	
	public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.login()",UMActivity.getViewId(control),args);
}


}
