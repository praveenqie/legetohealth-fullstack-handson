import React,{Component} from "react";

export class EmployeeStore extends React.Component{
constructor(props){
    super(props);
    this.state = {id:'',name:'',salary :''};

}
handleSubmit = (event)=>{
    event.preventDefault();
}
render(){
    return(
        <div>
            <h3>Employee Form</h3>
            <form onSubmit={this.handleSubmit}>
                <label > 
                    Id:<input type='number' name ='id' autoComplete="off" onChange={event => this.setState({id:event.target.value})}/>

                 </label>
                 <label > 
                    Name:<input type='text' name ='name' autoComplete="off" onChange={event => this.setState({name:event.target.value})}/>
                    
                 </label>
                 <label > 
                    Salary:<input type='number' name ='salary' autoComplete="off" onChange={event => this.setState({salary:event.target.value})}/>
                    
                 </label>
                 </form>
                 <div>
                    Id: {this.state.id} , Name : {this.state.name}, Salary: {this.state.salary}
                 </div>
           
        </div>
    )
}


}