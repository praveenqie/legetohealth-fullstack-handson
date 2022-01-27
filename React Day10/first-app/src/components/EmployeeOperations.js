import React,{Component} from "react";

export class EmployeeOperations extends React.Component{
    constructor(props){
        super(props)
        this.state = {id:'',name:'',salary :''};
    }
    handleSubmit = (event)=>{
        event.preventDefault();
    }
    handleChange = (event)=>{
        this.setState({[event.target.name]:event.target.value})
    }
    render(){
        return(
            <div>
            <h3>Employee Form</h3>
            <form onSubmit={this.handleSubmit}>
                <label > 
                    Id:<input type='number' name ='id' autoComplete="off" onChange={this.handleChange}/>

                 </label>
                 <label > 
                    Name:<input type='text' name ='name' autoComplete="off" onChange={this.handleChange}/>
                    
                 </label>
                 <label > 
                    Salary:<input type='number' name ='salary' autoComplete="off" onChange={this.handleChange}/>
                    
                 </label>
                 </form>
                 <div>
                    Id: {this.state.id} , Name : {this.state.name}, Salary: {this.state.salary}
                 </div>
           
        </div>

        )
    }

}