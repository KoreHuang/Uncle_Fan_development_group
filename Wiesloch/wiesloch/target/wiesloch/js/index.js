////轮播部分/////////////////////////////////
window.onload=function(){
	var lunbo=document.getElementById('lunbo');
	var lunbo_ul=document.getElementsByClassName('lunbo_ul')[0];
	var lunbo_li=lunbo_ul.getElementsByTagName('a');
	var index=0;
	var m=0;
	var length=lunbo_li[0].offsetWidth;
	var btn_li=document.getElementsByClassName('btn')[0].querySelectorAll('li');

	//定时器滑动事件//////////////////////////////////////
	var timer=setInterval(function(){
		sport();
	},3000)

	function sport(){
		index++;
		if(index>7)
		{
			index=0;
			lunbo_ul.style.left='0px';
			index++;
		}else{
			lunbo_ul.setAttribute('class','lunbo_ul active');
		}
		for(var j=0;j<btn_li.length;j++)
		{
			btn_li[j].style.background='#cccccc';
		}
		m=index;
		if(m>6){
			m=0;
		}
//		lunbo_ul.style.left=-index*length+'px';
        $('.lunbo_ul').animate({left:-index*length},800);
		btn_li[m].style.background='#ffffff';
	}
    //按钮点击事件////////////////////////////////////
    for(var i=0;i<btn_li.length;i++)
    {
    	(function(i){
    		btn_li[i].onclick=function(){
    			for(var j=0;j<btn_li.length;j++)
    			{
    				btn_li[j].style.background="#cccccc";
    			}
    			this.style.background="#ffffff";
    			lunbo_ul.style.left=-length*i+'px';
    		}
    	})(i)
    }
    //鼠标悬停事件
    $('.lunbo_ul,.btn').hover(function(){
		clearInterval(timer);
	},function(){
		timer=setInterval(function(){
			sport();
		},3000);
	});

}

