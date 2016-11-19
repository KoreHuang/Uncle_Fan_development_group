$(document).ready(function(){
   
   var t=0;
   
   for( var i=0;i<$('.aBtn>button').length;i++)
        {
            $('.aBtn>button')[i].index=i;

            $('.aBtn>button')[i].onmouseover=function(){
                $('.pic').empty();
                t=this.index;
               $('.pic').append("<img src='image/" + (this.index) + ".jpg'>");
            };
    }
	var timer = null;
	
			clearInterval(timer);
			
   timer = setInterval(function(){
	              if(t>$('.aBtn>button').length-1) t=0;
               $('.pic').empty();
               $('.pic').append("<img src='image/" + (t++) + ".jpg'>");

	     },2000);
    


  });// JavaScript Document