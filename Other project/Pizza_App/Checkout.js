import React from 'react';
import './Checkout.css';
import Subtotal from './Subtotal.js';

function Checkout(){
    return(
        <div className="checkout">
                <div className="checkout_left">
                    <div>
                        <h2 className="checkout_title">your shopping basket is empty</h2>
                        <p>you have no item in your basket. Buy one.</p>
                    </div>
                </div>
                <div className="checkout__right">
                    <Subtotal/>
                </div>
        </div>
    )
}

export default Checkout;