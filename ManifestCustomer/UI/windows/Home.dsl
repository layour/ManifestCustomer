<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Home" controller="HomeController" namespace="com.lionbridge.customer">
    <import ref="Home.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.lionbridge.customer.GlobalFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="狮桥超级车队" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" onclick="this.openAbout()" type="imagebutton" checked="false"/>
            <label id="label0"/>
            <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" onclick="this.openAddressSelect()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label1"/>
        <imageflipper titleheight="20" id="imageflipper0" descheight="0" interval="2000" flipperbtnvisible="false" isloop="true" scaletype="fitxy" autoflip="true">
            <imageflipperitem id="imageflipper0_0" title="狮桥资本" description="change01()" src="banner01.png"/>
            <imageflipperitem id="imageflipper0_1" title="狮桥资本" description="change02()" src="banner02.png"/>
            <imageflipperitem id="imageflipper0_2" title="狮桥资本" description="change03()" src="banner03.png"/>
            <imageflipperitem id="imageflipper0_3" title="狮桥资本" description="change04()" src="banner04.png"/> 
        </imageflipper>
        <div id="panel0">
            <image id="image0" onclick="this.openOrderList()" scaletype="fitxy" src="head_discount.png"/> 
        </div>
        <div id="panel1">
            <div id="panel3">
                <input id="imagebutton1" value="一键下单" istogglebutton="false" class="imagebuttonclass" onclick="this.openOrderList()" type="imagebutton" checked="false"/> 
            </div>
            <div id="panel4">
                <input id="imagebutton3" value="预约起运" istogglebutton="false" class="imagebuttonclass" onclick="this.openSubscribe()" type="imagebutton" checked="false"/> 
            </div> 
        </div>
        <div id="panel2">
            <div id="panel5">
                <input id="imagebutton2" value="订单查询" istogglebutton="false" class="imagebuttonclass" onclick="this.openOderQuery()" type="imagebutton" checked="false"/> 
            </div>
            <div id="panel6">
                <input id="imagebutton5" value="一键客服" istogglebutton="false" class="imagebuttonclass" onclick="this.openCallService()" type="imagebutton" checked="false"/> 
            </div> 
        </div> 
    </div> 
</window>
