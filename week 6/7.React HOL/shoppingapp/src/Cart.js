import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <table border="1" align="center" style={{ color: "green", fontSize: "20px" }}>
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {
            this.props.item.map((item, index) => {
              return (
                <tr key={index}>
                  <td>{item.itemname}</td>
                  <td>{item.price}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
    );
  }
}

export default Cart;
