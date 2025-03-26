/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workQueue;

import java.util.ArrayList;

/**
 *
 * @author YASH
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequests;
    }
}
