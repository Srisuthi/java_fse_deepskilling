import React, { Component } from 'react';

class CountPeople extends Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "100px" }}>
        <button 
          onClick={this.updateEntry} 
          style={{ backgroundColor: "lightgreen", padding: "10px", marginRight: "30px" }}
        >
          Login
        </button>
        <span style={{ fontSize: "20px", color: "green" }}>
          {this.state.entrycount} People Entered!!!
        </span>

        <br /><br />

        <button 
          onClick={this.updateExit} 
          style={{ backgroundColor: "lightgreen", padding: "10px", marginRight: "30px" }}
        >
          Exit
        </button>
        <span style={{ fontSize: "20px", color: "green" }}>
          {this.state.exitcount} People Left!!!
        </span>
      </div>
    );
  }
}

export default CountPeople;
