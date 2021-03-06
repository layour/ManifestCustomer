//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.lionbridge.customer.VoucherController');
com.lionbridge.customer.VoucherController = function() {
    com.lionbridge.customer.VoucherController.initializeBase(this);
    this.initialize();
}
function com$lionbridge$customer$VoucherController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$lionbridge$customer$VoucherController$evaljs(js){
    eval(js)
}
function com$lionbridge$customer$VoucherController$closeVoucher(sender, args){
	$view.close();
}
function com$lionbridge$customer$VoucherController$previousflipper(sender, args){
	var index = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup0").set("selectedvalue", index);
}
function com$lionbridge$customer$VoucherController$nextflipper(sender, args){
	var index = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup0").set("selectedvalue", index);
}
function com$lionbridge$customer$VoucherController$changeToggle(sender, args){
	var value = $id("togglebuttongroup0").get("selectedvalue");
	if(value == 0){
		$id("flipperdefine0").set("viewindex", value);
	} else if(value == 1){
		$id("flipperdefine0").set("viewindex", value);
	} else if(value == 2){
		$id("flipperdefine0").set("viewindex", value);
	}
}
function com$lionbridge$customer$VoucherController$loadVoucher(sender, args){
	var json = {
		list : [{
			voucher : "100元狮桥超级车队代金劵",
			stime : "2015-07-07",
			etime : "2015-08-07"
		}, {
			voucher : "50元狮桥超级车队代金劵",
			stime : "2015-07-07",
			etime : "2015-08-07"
		}, {
			voucher : "200元狮桥超级车队代金劵",
			stime : "2015-07-07",
			etime : "2015-08-07"
		}]
	}
	$ctx.push(json);
}
com.lionbridge.customer.VoucherController.prototype = {
    loadVoucher : com$lionbridge$customer$VoucherController$loadVoucher,
    changeToggle : com$lionbridge$customer$VoucherController$changeToggle,
    nextflipper : com$lionbridge$customer$VoucherController$nextflipper,
    previousflipper : com$lionbridge$customer$VoucherController$previousflipper,
    closeVoucher : com$lionbridge$customer$VoucherController$closeVoucher,
    initialize : com$lionbridge$customer$VoucherController$initialize,
    evaljs : com$lionbridge$customer$VoucherController$evaljs
};
com.lionbridge.customer.VoucherController.registerClass('com.lionbridge.customer.VoucherController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
