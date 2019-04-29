package com.cg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Offer;
import com.cg.beans.Product;
import com.cg.repo.Offerrepo;



@Service
public class OfferService {
	@Autowired
	private Offerrepo Offerrepo;

	public int addOffer(Offer Offer) {
		/*String[] string= {"FIRST","CPST","FEST"};
		Random random=new Random();
		int index=random.nextInt(3);
		int i=(int)(Math.random()*1000);
		System.out.println(string[index]+i);*/
		Offerrepo.save(Offer);
		return Offer.getOfferId();
	}
	
	public List<Offer> displayAllOffer() {
		return Offerrepo.findAll();
	}
	//public void deleteCoupon(int couponId) {
		//Offerrepo.deleteById(couponId);	
	//}
	public double applyOffer( int offerid) {
		Offer Offer = Offerrepo.findById(offerid).get();
		Product product= Offer.getProduct();
		//if(Offer!=null)
		//{
//			LocalDate localdate = LocalDate.now();
//			Date date1= Date.valueOf(localdate);
//			/*if(Coupon.getStartDate().before(date1)&&Coupon.getEndDate().after(date1)&&order.getOrderAmount()>Coupon.getCouponQuantity())
//			{
//				//order.setOrderAmount(order.getOrderAmount()-Coupon.getCouponQuantity());
//				//orderDetailsRepo.save(order);
//			}*/
			return product.getProductPrice()-Offer.getDiscountOffered();
		//}
	}
}

