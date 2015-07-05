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

public abstract class RepasswordActivity extends UMWindowActivity {

	protected UMWindow Repassword = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label1 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMImageButton imagebutton1 = null;
protected UMTextbox textbox0 = null;
protected UMLabel label3 = null;
protected XHorizontalLayout panel2 = null;
protected UMImageButton imagebutton2 = null;
protected UMTextbox textbox1 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel3 = null;
protected UMImageButton imagebutton3 = null;
protected UMTextbox textbox2 = null;

	
	protected final static int ID_REPASSWORD = 983423225;
protected final static int ID_VIEWPAGE0 = 1360916862;
protected final static int ID_NAVIGATORBAR0 = 1133428468;
protected final static int ID_IMAGEBUTTON0 = 204211950;
protected final static int ID_LABEL1 = 924365095;
protected final static int ID_BUTTON0 = 1529791443;
protected final static int ID_LABEL0 = 167193247;
protected final static int ID_PANEL0 = 1042011938;
protected final static int ID_PANEL1 = 1663680779;
protected final static int ID_IMAGEBUTTON1 = 870429123;
protected final static int ID_TEXTBOX0 = 2085158100;
protected final static int ID_LABEL3 = 2018576636;
protected final static int ID_PANEL2 = 1754235936;
protected final static int ID_IMAGEBUTTON2 = 1761132359;
protected final static int ID_TEXTBOX1 = 1980308599;
protected final static int ID_LABEL2 = 1694108804;
protected final static int ID_PANEL3 = 1583922387;
protected final static int ID_IMAGEBUTTON3 = 2132910597;
protected final static int ID_TEXTBOX2 = 1823547347;

	
	
	@Override
	public String getControllerName() {
		return "RepasswordController";
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
		  idmap.put("Repassword",ID_REPASSWORD);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("imagebutton3",ID_IMAGEBUTTON3);
  idmap.put("textbox2",ID_TEXTBOX2);

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
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"halign","LEFT"
,"width","fill"
,"title","修改密码"
,"height","44.0"
,"color","#d68f2f"
,"layout-type","linear"
,"font-size","20"
,"background","#321e12"
,"font-family","default"
,"valign","center"
);
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"width","44"
,"icon-width","15"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","21"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","i_back.png"
,"onclick","action:imagebutton0_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
navigatorbar0.addView(imagebutton0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"height","44"
,"color","#d68f2f"
,"layout-type","linear"
,"width","44"
,"font-size","16"
,"value","修改"
,"font-family","default"
,"font-pressed-color","#ffff33"
,"valign","center"
);
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-right","10"
,"padding-left","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
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
panel1.addView(imagebutton1);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","LEFT"
,"weight","1"
,"placeholder","请输入您的原密码"
,"width","0"
,"maxlength","256"
,"height","44"
,"color","#167ef8"
,"font-size","14"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
panel1.addView(textbox0);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","10"
,"padding-left","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
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
panel2.addView(imagebutton2);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","4"
,"halign","LEFT"
,"weight","1"
,"placeholder","请输入6-16的数字或字母密码"
,"width","0"
,"maxlength","256"
,"height","44"
,"color","#167ef8"
,"font-size","14"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
panel2.addView(textbox1);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","10"
,"padding-left","10"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
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
panel3.addView(imagebutton3);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
,"padding-left","4"
,"halign","LEFT"
,"weight","1"
,"placeholder","请再次输入6-16的数字或字母密码"
,"width","0"
,"maxlength","256"
,"height","44"
,"color","#167ef8"
,"font-size","14"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
panel3.addView(textbox2);

return panel3;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","134"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","10"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
panel0.addView(panel1);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"background","#dbdbdb"
,"font-size","14"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel0.addView(label3);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel0.addView(panel2);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"margin-right","10"
,"halign","center"
,"height","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"background","#dbdbdb"
,"width","fill"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel0.addView(label2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel0.addView(panel3);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ededed"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup);
viewPage0.addView(navigatorbar0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","2"
,"color","#000000"
,"layout-type","linear"
,"background","#ec9e34"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
viewPage0.addView(label0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Repassword = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REPASSWORD
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","RepasswordController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Repassword.addView(viewPage0);

return (UMWindow)Repassword;
}

	
	public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeRepassword()",UMActivity.getViewId(control),args);
}


}
