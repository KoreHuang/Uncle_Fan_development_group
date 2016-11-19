     $(function() {
		 $('body').delegate('i[data-type="checkbox"]', 'click', function() {
				mCart.checkItem($(this));
			});
			$('body').delegate('label[data-type="checkallcli"]', 'click', function() {
				mCart.checkItemAll($(this).find("i[data-type='checkall']"));
			});
			$('body').delegate('.catBomAllCheak .delBtn', 'click', function() {
				var platfrom = $('#platfrom_cart').val();
				mCart.submitOrder(platfrom);
			});// JavaScript Document
	 });