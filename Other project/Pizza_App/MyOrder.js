import React from "react";
import './MyOrder.css';
import { Link } from 'react-router-dom';
import SearchIcon from '@material-ui/icons/Search';

function MyOrder(){
    return(
        <div className="myorder">
            <div className="JV-wt3"> 
            <div class="_3p9Ct9">
                <div class="_3E8aIl _1ejeYK">
                    <div class="_1Rot47">
                        <div class="B7BJU0">
                            <span>Filter</span>
                        </div>
                    </div>
                    <div class="Okfx8U">
                        <div class="_2MvS62">Order Status</div>
                        <div class="O1ypae" data-val="On_the_way">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">On the way</div>
                        </div>
                        <div class="O1ypae" data-val="Delivered">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">Delivered</div>
                        </div>
                        <div class="O1ypae" data-val="Cancelled">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">Cancelled</div>
                        </div>
                        <div class="O1ypae" data-val="Returned">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">Returned</div>
                        </div>
                    </div>
                    <div class="Okfx8U">
                        <div class="_2MvS62">Order Time</div>
                        <div class="O1ypae" data-val="Last_30_days">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">Last 30 days</div>
                        </div>
                        <div class="O1ypae" data-val="2020">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">2020</div>
                        </div>
                        <div class="O1ypae" data-val="2019">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">2019</div>
                        </div>
                        <div class="O1ypae" data-val="Older">
                            <label class="_2iDkf8 _2-BSLO">
                                <input type="checkbox" class="_30VH1S" readonly></input>
                                <div class="_24_Dny"></div>
                            </label>
                            <div class="YeQMM">Older</div>
                        </div>
                    </div>
                </div>
            </div>
            <div className="myorder__list"> 
                <div className="order__search">
                   <input type="text" className="order__searchInput" placeholder="Search your order here"/>
                     <Link to="/">
                        <SearchIcon className="order__searchIcon" />
                     </Link>
                </div>       
                <img src="	https://pizzaonline.dominos.co.in/static/assets/myorder_empty@2x.png"></img>    
                <h1>NO ORDER AVAILABLE</h1>
                <h3>Please add some item from menu</h3>
                <Link to="/menu" >
                    <button className="explore__button" onClick="menu"><span className="button__span">Explore menu</span></button>
                </Link> 
            </div>
            </div>
        </div>
    )
}

export default MyOrder;