//Group33

object Harvest_Stats extends App{
    var harvest_details_array = Array.ofDim[Int](4,7)
    var maxWeek = 0 //week which include the day of maximum tea leaves weight received

    var maxDay = 0 //day of maximum tea leaves weight received

    var minWeek = 0 //week which include the day of minimum tea leaves weight received

    var minDay = 0 //day of minimum tea leaves weight received

    var total_weight = 0 //total tea leaves weight which received for month

    var day_count = 0 //total day count which indicate number of days factory receives tea leaves


  //two dimensional array which consist the details of tea leaves harvest
    harvest_details_array(0)(0) = 56
    harvest_details_array(0)(1) = 44
    harvest_details_array(0)(2) = 71
    harvest_details_array(0)(3) = 40
    harvest_details_array(0)(4) = 100
    harvest_details_array(0)(5) = 85
    harvest_details_array(0)(6) = 73
    harvest_details_array(1)(0) = 431
    harvest_details_array(1)(1) = 64
    harvest_details_array(1)(2) = 133
    harvest_details_array(1)(3) = 154
    harvest_details_array(1)(4) = 104
    harvest_details_array(1)(5) = 164
    harvest_details_array(1)(6) = 176
    harvest_details_array(2)(0) = 1453
    harvest_details_array(2)(1) = 235
    harvest_details_array(2)(2) = 220
    harvest_details_array(2)(3) = 195
    harvest_details_array(2)(4) = 182
    harvest_details_array(2)(5) = 326
    harvest_details_array(2)(6) = 243
    harvest_details_array(3)(0) = 43
    harvest_details_array(3)(1) = 195
    harvest_details_array(3)(2) = 314
    harvest_details_array(3)(3) = 443
    harvest_details_array(3)(4) = 105
    harvest_details_array(3)(5) = 59
    harvest_details_array(3)(6) = 89

  //assign maximum and minimum to first element of the two dimension array
    var maximum = harvest_details_array(0)(0)
    var minimum = harvest_details_array(0)(0)


  //find maximum and minimum
    for(i<-0 to 3){

      for(j<-0 to 6){
        total_weight+=harvest_details_array(i)(j)

        if(harvest_details_array(i)(j)>maximum){

          maximum=harvest_details_array(i)(j)
          maxWeek = i
          maxDay = j

        }

        if(harvest_details_array(i)(j)<minimum){

          minimum=harvest_details_array(i)(j)
          minWeek = i
          minDay = j

        }

        day_count=day_count+1

      }

    }

    //print about maximum
    print("The maximum tea leaves harvest by weight is "+maximum+" kilograms and it occurs in day "+maxDay+" of week "+maxWeek)
    print(".\n")

    //print about minimum
    print("The minimum tea leaves harvest by weight is : "+minimum+" kilograms and it occurs in day "+minDay+" of week "+minWeek)
    print(".\n")

    //range of harvest
    var range = maximum - minimum
    print("The range of harvest is : "+range)
    print(".\n")

    //average of harvest
    var average = total_weight/day_count
    print("The average of weight of tea leaves is : "+average)
    print(".\n")
  }
