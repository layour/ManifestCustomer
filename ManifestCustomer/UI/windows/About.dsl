<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="About" controller="AboutController" namespace="com.lionbridge.customer">
    <import ref="About.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="我" class="navigatorbarclass">
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAbout()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label1"/>
        <div id="panel6">
            <div id="panel0" onclick="this.openVoucher()">
                <image id="image0" scaletype="fitcenter" src="i_order.png"/>
                <label id="label0">代金卷</label> 
            </div>
            <label id="label2"/>
            <div id="panel1">
                <image id="image1" scaletype="fitcenter" src="i_order.png"/>
                <label id="label3">发票申请</label>
                <label id="label13">￥0</label> 
            </div>
            <label id="label4"/>
            <div id="panel2" onclick="this.openAddress()">
                <image id="image2" scaletype="fitcenter" src="i_location.png"/>
                <label id="label5">常用地址</label> 
            </div> 
        </div>
        <div id="panel7">
            <div id="panel3" onclick="this.openRepassword()">
                <image id="image3" scaletype="fitcenter" src="i_oetup.png"/>
                <label id="label7">修改密码</label> 
            </div>
            <label id="label8"/>
            <div id="panel4" onclick="this.openOpinionDetail()">
                <image id="image4" scaletype="fitcenter" src="i_opinion.png"/>
                <label id="label9">意见反馈</label> 
            </div>
            <label id="label10"/>
            <div id="panel5" onclick="this.openAboutDetail()">
                <image id="image5" scaletype="fitcenter" src="i_about.png"/>
                <label id="label11">关于我们</label> 
            </div> 
        </div>
        <input id="button0" value="退出登录" class="buttonclass loginbuttonclass" onclick="this.login()" type="button"/> 
    </div> 
</window>
