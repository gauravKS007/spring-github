import React from "react";
import user from "../images/User.png";
import trash from "../images/Trash.png";

const ContactCard= (props) => {
      const{id,name,email}= props.contact;
      return(
        <div className="item">
            <img className="ui avatar image" src={user} alt="user"/>
           <div className="content">
                <div className="header">{name}</div>
                <div>{email}</div>
           </div>
        <img className="trash alternate outline icon" src={trash} 
        alt="trash" width="70" height="60" 
        onClick={() => props.clickHandler(id)}
        />
        {/* <i className="trash alternate outline icon"
        style={{color:"red", marginTop:"7px"}} ></i> */}
    </div>
    );
};
export default ContactCard;
