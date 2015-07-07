<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OrderQuery" controller="OrderQueryController" namespace="com.lionbridge.customer">
    <import ref="OrderQuery.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="定单查询" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOrderQuery()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <toggleButtonGroup id="togglebuttongroup1" onchange="this.changeToggle()">
            <toggleButton id="togglebutton1" value="0" class="togglebtnitemclass" textOff="未完成定单" textOn="未完成定单" type="button" checked="true"/>
            <toggleButton id="togglebutton5" value="1" class="togglebtnitemclass" textOff="已完成定单" textOn="已完成定单" type="button"/> 
        </toggleButtonGroup>
        <flipper id="flipperdefine0" onnextflipper="this.nextflipper()" onpreviousflipper="this.previousflipper()" viewindex="0">
            <div id="panel0" title="页面1">
                <listView id="listviewdefine0" bindfield="list" onload="this.loadOrder()">
                    <div id="panel7">
                        <div id="panel2">
                            <div id="panel4">
                                <label id="label1" bindfield="status">正在运输</label>
                                <label id="label2" bindfield="orderno">订单号：100000663</label> 
                            </div>
                            <label id="label3" bindfield="line">专线名称：北京市-上海市</label>
                            <div id="panel6">
                                <label id="label4" bindfield="count">定舱数量：1</label>
                                <label id="label6" bindfield="money">订单金额：￥6000</label> 
                            </div>
                            <label id="label5"/>
                            <div id="panel5">
                                <input id="imagebutton1" value="订单跟踪" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                                <input id="imagebutton2" value="轨迹跟踪" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                                <input id="imagebutton3" value="查看回单" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
                            </div> 
                        </div> 
                    </div> 
                </listView> 
            </div>
            <div id="panel1" title="页面2">
                <listView id="listviewdefine1" bindfield="list" onload="this.loadOrder()">
                    <div id="panel3">
                        <div id="panel8">
                            <div id="panel9">
                                <label id="label7" bindfield="status">正在运输</label>
                                <label id="label8" bindfield="orderno">订单号：100000663</label> 
                            </div>
                            <label id="label9" bindfield="line">专线名称：北京市-上海市</label>
                            <div id="panel10">
                                <label id="label10" bindfield="count">定舱数量：1</label>
                                <label id="label11" bindfield="money">订单金额：￥6000</label> 
                            </div>
                            <label id="label12"/>
                            <div id="panel11">
                                <input id="imagebutton4" value="订单跟踪" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                                <input id="imagebutton5" value="轨迹跟踪" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                                <input id="imagebutton6" value="查看回单" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
                            </div> 
                        </div> 
                    </div> 
                </listView> 
            </div> 
        </flipper> 
    </div> 
</window>
