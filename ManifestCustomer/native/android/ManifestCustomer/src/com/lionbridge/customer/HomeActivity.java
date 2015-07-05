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

public abstract class HomeActivity extends UMWindowActivity {

	protected UMWindow Home = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton4 = null;
protected UMLabel label1 = null;
protected UMImageFlipper imageflipper0 = null;
protected UMImageFlipperItem imageflipper0_0 = null;
protected UMImageFlipperItem imageflipper0_1 = null;
protected UMImageFlipperItem imageflipper0_2 = null;
protected UMImageFlipperItem imageflipper0_3 = null;
protected XHorizontalLayout panel0 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel1 = null;
protected XHorizontalLayout panel3 = null;
protected UMImageButton imagebutton1 = null;
protected XHorizontalLayout panel4 = null;
protected UMImageButton imagebutton3 = null;
protected XHorizontalLayout panel2 = null;
protected XHorizontalLayout panel5 = null;
protected UMImageButton imagebutton2 = null;
protected XHorizontalLayout panel6 = null;
protected UMImageButton imagebutton5 = null;

	
	protected final static int ID_HOME = 659704979;
protected final static int ID_VIEWPAGE0 = 1079335028;
protected final static int ID_NAVIGATORBAR0 = 280911162;
protected final static int ID_IMAGEBUTTON0 = 2080442414;
protected final static int ID_LABEL0 = 1079279627;
protected final static int ID_IMAGEBUTTON4 = 1608707947;
protected final static int ID_LABEL1 = 1789424070;
protected final static int ID_IMAGEFLIPPER0 = 550268834;
protected final static int ID_IMAGEFLIPPER0_0 = 326135065;
protected final static int ID_IMAGEFLIPPER0_1 = 273362699;
protected final static int ID_IMAGEFLIPPER0_2 = 32936103;
protected final static int ID_IMAGEFLIPPER0_3 = 673966131;
protected final static int ID_PANEL0 = 1073406419;
protected final static int ID_IMAGE0 = 603600161;
protected final static int ID_PANEL1 = 1076319233;
protected final static int ID_PANEL3 = 2112518589;
protected final static int ID_IMAGEBUTTON1 = 788216923;
protected final static int ID_PANEL4 = 694815776;
protected final static int ID_IMAGEBUTTON3 = 1181712313;
protected final static int ID_PANEL2 = 1716503793;
protected final static int ID_PANEL5 = 927676734;
protected final static int ID_IMAGEBUTTON2 = 610225456;
protected final static int ID_PANEL6 = 1099217899;
protected final static int ID_IMAGEBUTTON5 = 632948870;

	
	
	@Override
	public String getControllerName() {
		return "HomeController";
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
		  idmap.put("Home",ID_HOME);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton4",ID_IMAGEBUTTON4);
  idmap.put("label1",ID_LABEL1);
  idmap.put("imageflipper0",ID_IMAGEFLIPPER0);
  idmap.put("imageflipper0_0",ID_IMAGEFLIPPER0_0);
  idmap.put("imageflipper0_1",ID_IMAGEFLIPPER0_1);
  idmap.put("imageflipper0_2",ID_IMAGEFLIPPER0_2);
  idmap.put("imageflipper0_3",ID_IMAGEFLIPPER0_3);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("imagebutton3",ID_IMAGEBUTTON3);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("imagebutton5",ID_IMAGEBUTTON5);

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
,"title","狮桥超级车队"
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
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","head_my.png"
,"value","图标名称"
,"onclick","action:imagebutton0_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
navigatorbar0.addView(imagebutton0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
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
navigatorbar0.addView(label0);
imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON4
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
,"icon-background-image","head_location.png"
,"value","图标名称"
,"onclick","action:imagebutton4_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
navigatorbar0.addView(imagebutton4);

return navigatorbar0;
}
public View getImageflipper0View(final UMActivity context,IBinderGroup binderGroup) {
imageflipper0 = (UMImageFlipper)ThirdControl.createControl(new UMImageFlipper(context),ID_IMAGEFLIPPER0
,"titleheight","20"
,"height","144"
,"descheight","0"
,"interval","2000"
,"flipperbtnvisible","false"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitxy"
,"isloop","true"
,"autoflip","true"
);
imageflipper0_0 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_0
,"title","狮桥资本"
,"description",""
,"layout-type","linear"
,"src","banner01.png"
);
imageflipper0.addView(imageflipper0_0);
imageflipper0_1 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_1
,"title","狮桥资本"
,"description",""
,"layout-type","linear"
,"src","banner02.png"
);
imageflipper0.addView(imageflipper0_1);
imageflipper0_2 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_2
,"title","狮桥资本"
,"description",""
,"layout-type","linear"
,"src","banner03.png"
);
imageflipper0.addView(imageflipper0_2);
imageflipper0_3 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_3
,"title","狮桥资本"
,"description",""
,"layout-type","linear"
,"src","banner04.png"
);
imageflipper0.addView(imageflipper0_3);

return imageflipper0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"halign","LEFT"
,"height","110"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"margin-right","10"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"margin-left","10"
,"margin-bottom","10"
,"scaletype","fitxy"
,"margin-top","10"
,"src","head_discount.png"
);
panel0.addView(image0);

return panel0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"halign","CENTER"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
,"halign","center"
,"width","88"
,"icon-width","56"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","56"
,"height","88"
,"color","#232323"
,"layout-type","linear"
,"font-size","14"
,"icon-background-image","head_truck.png"
,"value","一键下单"
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
,"halign","CENTER"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON3
,"halign","center"
,"width","88"
,"icon-width","56"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","56"
,"height","88"
,"color","#232323"
,"layout-type","linear"
,"font-size","14"
,"icon-background-image","head_pre.png"
,"value","预约起运"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel4.addView(imagebutton3);

return panel4;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"halign","LEFT"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel1.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel1.addView(panel4);

return panel1;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"halign","CENTER"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
,"halign","center"
,"width","88"
,"icon-width","56"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","56"
,"height","88"
,"color","#232323"
,"layout-type","linear"
,"font-size","14"
,"icon-background-image","head_query.png"
,"value","订单查询"
,"onclick","action:imagebutton2_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel5.addView(imagebutton2);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"halign","CENTER"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
imagebutton5 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON5
,"halign","center"
,"width","88"
,"icon-width","56"
,"istogglebutton","false"
,"font-pressed-color","#FF7800"
,"icon-height","56"
,"height","88"
,"color","#232323"
,"layout-type","linear"
,"font-size","14"
,"icon-background-image","head_customerservice.png"
,"value","一键客服"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel6.addView(imagebutton5);

return panel6;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"halign","LEFT"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel2.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup);
panel2.addView(panel6);

return panel2;
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
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
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
viewPage0.addView(label1);
View imageflipper0 = (View) getImageflipper0View((UMActivity)context,binderGroup);
viewPage0.addView(imageflipper0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
viewPage0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Home = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_HOME
,"halign","center"
,"height","520"
,"layout","vbox"
,"width","fill"
,"controller","HomeController"
,"valign","TOP"
,"namespace","com.lionbridge.customer"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Home.addView(viewPage0);

return (UMWindow)Home;
}

	
	public void actionImagebutton4_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openAddressSelect()",UMActivity.getViewId(control),args);
}
public void actionImagebutton0_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openAbout()",UMActivity.getViewId(control),args);
}
public void actionImagebutton2_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.openOderQuery()",UMActivity.getViewId(control),args);
}


}
