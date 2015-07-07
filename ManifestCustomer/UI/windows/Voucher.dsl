<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Voucher" controller="VoucherController" namespace="com.lionbridge.customer">
    <import ref="Voucher.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="我的代金劵" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeVoucher()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <toggleButtonGroup id="togglebuttongroup0" onchange="this.changeToggle()">
            <toggleButton id="togglebutton0" value="0" class="togglebtnitemclass" textOff="可用代金劵" textOn="可用代金劵" type="button" checked="true"/>
            <toggleButton id="togglebutton1" value="1" class="togglebtnitemclass" textOff="已用代金劵" textOn="已用代金劵" type="button"/>
            <toggleButton id="togglebutton3" value="2" class="togglebtnitemclass" textOff="过期代金劵" textOn="过期代金劵" type="button"/> 
        </toggleButtonGroup>
        <flipper id="flipperdefine0" onnextflipper="this.nextflipper()" onpreviousflipper="this.previousflipper()" viewindex="0">
            <div id="panel0" title="页面1">
                <listView id="listviewdefine0" bindfield="list" onload="this.loadVoucher()">
                    <div id="panel12">
                        <div id="panel3">
                            <div id="panel6">
                                <label id="label1">超级车队</label>
                                <label id="label2" bindfield="voucher">100元狮桥超级车队代金劵</label> 
                            </div>
                            <div id="panel7">
                                <label id="label3">代金劵</label>
                                <label id="label4"/>
                                <label id="label5" bindfield="stime">2015-04-07</label>
                                <label id="label6">到</label>
                                <label id="label7" bindfield="etime">2015-06-09</label> 
                            </div> 
                        </div> 
                    </div> 
                </listView> 
            </div>
            <div id="panel1" title="页面2">
                <listView id="listviewdefine1" bindfield="list" onload="this.loadVoucher()">
                    <div id="panel4">
                        <div id="panel8">
                            <div id="panel9">
                                <label id="label8">超级车队</label>
                                <label id="label9" bindfield="voucher">100元狮桥超级车队代金劵</label> 
                            </div>
                            <div id="panel13">
                                <label id="label10">代金劵</label>
                                <label id="label11"/>
                                <label id="label12" bindfield="stime">2015-04-07</label>
                                <label id="label13">到</label>
                                <label id="label14" bindfield="etime">2015-06-09</label> 
                            </div> 
                        </div> 
                    </div> 
                </listView> 
            </div>
            <div id="panel2" title="页面3">
                <listView id="listviewdefine2" bindfield="list" onload="this.loadVoucher()">
                    <div id="panel5">
                        <div id="panel10">
                            <div id="panel11">
                                <label id="label15">超级车队</label>
                                <label id="label16" bindfield="voucher">100元狮桥超级车队代金劵</label> 
                            </div>
                            <div id="panel14">
                                <label id="label17">代金劵</label>
                                <label id="label18"/>
                                <label id="label19" bindfield="stime">2015-04-07</label>
                                <label id="label20">到</label>
                                <label id="label21" bindfield="etime">2015-06-09</label> 
                            </div> 
                        </div> 
                    </div> 
                </listView> 
            </div> 
        </flipper> 
    </div> 
</window>
