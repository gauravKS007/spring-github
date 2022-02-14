import React from "react";
import SearchIcon from '@material-ui/icons/Search';
import './Header.css'
import { Link } from 'react-router-dom';
import ShoppingBasketIcon from '@material-ui/icons/ShoppingBasket'

function Header() {
    return (
        <nav className="header">
            <div className="header__search">
                <input type="text" className="header__searchInput" />
                <SearchIcon className="header__searchIcon" />
            </div>
            <div className="header__nav">
                <Link to="/myorder" className="header__link">
                    <div className="header__option">
                        <span className="header__optionLineOne">My Order</span>
                    </div>
                </Link>
            </div>
            {/*basket-icon with number */}
            <Link to="/checkout" className="header__link">
                <div className="header__optionBasket">
                   <ShoppingBasketIcon />
                   <span className="header__optionLineTwo header__productCount">2</span>
                </div>
            </Link>
        </nav>
    )
}
export default Header;