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

public abstract class VoucherActivity extends UMWindowActivity {

	protected UMWindow Voucher = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton3 = null;
protected UMViewFlipper flipperdefine0 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout panel1 = null;

	
	protected final static int ID_VOUCHER = 2037089280;
protected final static int ID_VIEWPAGE0 = 37210724;
protected final static int ID_NAVIGATORBAR0 = 472855832;
protected final static int ID_IMAGEBUTTON0 = 934733098;
protected final static int ID_LABEL0 = 35779491;
protected final static int ID_TOGGLEBUTTONGROUP0 = 869950561;
protected final static int ID_TOGGLEBUTTON0 = 492362327;
protected final static int ID_TOGGLEBUTTON1 = 214150933;
protected final static int ID_TOGGLEBUTTON3 = 2085506501;
protected final static int ID_FLIPPERDEFINE0 = 1887314935;
protected final static int ID_PANEL0 = 895529017;
protected final static int ID_PANEL1 = 245126286;

	
	
	@Override
	public String getControllerName() {
		return "VoucherController";
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
		  idmap.put("Voucher",ID_VOUCHER);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton3",ID_TOGGLEBUTTON3);
  idmap.put("flipperdefine0",ID_FLIPPERDEFINE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);

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
,"title","我的代金卷"
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

return navigatorbar0;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"margin-right","20"
,"halign","CENTER"
,"height","44"
,"layout","hbox"
,"width","300"
,"margin-left","20"
,"valign","top"
);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"background-image-off","label_4_left"
,"width","100.0"
,"textoff","可用代金卷"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_4_left_touch"
,"height","42.0"
,"color","#ff7800"
,"layout-type","hbox"
,"font-size","17"
,"value","0"
,"font-family","default"
,"texton","可用代金卷"
,"valign","center"
,"checked","true"
);
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"background-image-off","label_4_middle"
,"width","100.0"
,"textoff","已用代金卷"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_4_middle_touch"
,"height","42.0"
,"color","#ff7800"
,"layout-type","hbox"
,"font-size","17"
,"value","1"
,"font-family","default"
,"texton","已用代金卷"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton1);
togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON3
,"halign","center"
,"background-image-off","label_4_right"
,"width","100.0"
,"textoff","过期代金卷"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_4_right_touch"
,"height","42.0"
,"color","#ff7800"
,"layout-type","hbox"
,"font-size","17"
,"value","2"
,"font-family","default"
,"texton","过期代金卷"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton3);

return togglebuttongroup0;
}
public View getFlipperdefine0View(final UMActivity context,IBinderGroup binderGroup) {
flipperdefine0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPERDEFINE0
,"halign","center"
,"height","0"
,"weight","1"
,"layout","vbox"
,"width","fill"
,"viewindex","0"
,"valign","TOP"
);
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"title","页面1"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
flipperdefine0.addView(panel0);
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"title","页面2"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
flipperdefine0.addView(panel1);

return flipperdefine0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
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
,"font-size","14"
,"background","#ec9e34"
,"width","fill"
,"font-family","default"
,"valign","center"
);
viewPage0.addView(label0);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup);
viewPage0.addView(togglebuttongroup0);
View flipperdefine0 = (View) getFlipperdefine0View((UMActivity)context,binderGroup);
viewPage0.addView(flipperdefine0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Voucher = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_VOUCHER
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","VoucherController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Voucher.addView(viewPage0);

return (UMWindow)Voucher;
}

	
	public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.closeVoucher()",UMActivity.getViewId(control),args);
}


}
