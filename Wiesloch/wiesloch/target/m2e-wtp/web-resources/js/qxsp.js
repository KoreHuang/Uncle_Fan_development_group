/**
 * Created by Administrator on 2016/3/18.
 */
    //删除弹窗
$(function() {
    $(".btn").click(function () {
        $(".alert").slideDown();
        $(".theme-popover-mask").show();
    });
    $(".theme-popover-mask").click(function () {
        $(".alert").slideUp();
        $(".theme-popover-mask").hide();
    });
});
$(function(){
	$(".delete").click(function(){
		$(".spxz").hide();
		 $(".alert").slideUp();
	        $(".theme-popover-mask").hide();
	        $(".li5").hide();
	        $(".li6").hide();
	})
});
$(function(){
	$(".none").click(function(){
		  $(".alert").slideUp();
	        $(".theme-popover-mask").hide();
	})
});


function check(){
	var checkbox = document.getElementById('checkbox');
	checkbox.value==1?checkbox.value=2 : checkbox.value=1;
	var checkboxs = document.getElementsByName('box');
	for(var i=0; i<checkboxs.length;i++){

	if(checkbox.value==1){
		checkboxs[i].checked=false;
	}else{
	checkboxs[i].checked=true;
	}
    }};
function checkOrderState(){
	var flag = false;
	$(".spxz input[type='checkbox']").each(function(){
		if($(this).is(':checked') == true){
			flag = true;
		}
	})
	return flag;
	
}   
function totalAllSelect(obj){
	$("#totalMoney").val(0);
	if(obj.checked){
		$(".spxz input[type='checkbox']").each(function(){
    	    $(this).attr("checked","checked");
    	    var obj = $(this);
        	var price = $(obj).parent().prev().val();
        	var amount = $(obj).parent().next().next().next().find("input[type='text']").val();
        	var addValue = Number(price) * Number(amount);
        	var value = $("#totalMoney").val();
        	$("#totalMoney").val((Number(addValue)+ Number(value)).toFixed(2));
    	});
	}else{
		$(".spxz input[type='checkbox']").each(function(){
    	    $(this).attr("checked",false);
    	    $("#totalMoney").val(0);
    	});
	}
}
function total(event){
	var obj = $(event);
	var price = $(obj).parent().prev().val();
	var amount = $(obj).parent().next().next().next().find("input[type='text']").val();
	var addValue = Number(price) * Number(amount);
	var value = $("#totalMoney").val();
	if($(event).is(':checked') == true){
		$("#totalMoney").val((Number(addValue)+ Number(value)).toFixed(2));
		
	}else{
    	$("#totalMoney").val( Number(value)-(Number(addValue)).toFixed(2));
	}
	
	
}
function editNumAdd(event) {
    var t = $(event).prev();
    var one = $(event).parent().parent().prev();
    var oneValue = one.find("input[type='text']").val();
    var totalMoney = $("#totalMoney").val();
    //数量增加操作
        t.val(parseInt(t.val()) + 1);
        if (parseInt(t.val()) != 1) {
            $(this).attr('disabled', false);
        }
        function setTotal() {
        	$("#totalMoney").val((Number(totalMoney)+ Number(oneValue)).toFixed(2));

        }
        if($(event).parent().parent().prev().prev().prev().find("input[type='checkbox']").attr("checked") == 'checked'){
        	setTotal();
        }
}


function editNumSub(event) {
    var t = $(event).next();
    var one = $(event).parent().parent().prev();
    var oneValue = one.find("input[type='text']").val();
    var totalMoney = $("#totalMoney").val();
    console.log($("#totalMoney"))
    console.log(totalMoney+":"+oneValue)
    if (parseInt(t.val()) > 1) {
    	
        $(event).attr('disabled', 'disabled');
        //数量增加操作
        t.val(parseInt(t.val()) - 1);
        function setTotal() {
        	$("#totalMoney").val((totalMoney-oneValue).toFixed(2));
        }
        if($(event).parent().parent().prev().prev().prev().find("input[type='checkbox']").attr("checked") == 'checked'){
        	setTotal();
        }
        
    }
   
    
}