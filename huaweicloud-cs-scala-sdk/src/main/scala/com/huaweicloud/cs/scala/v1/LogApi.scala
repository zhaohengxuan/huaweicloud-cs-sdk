/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package com.huaweicloud.cs.scala.v1

import com.huaweicloud.cs.scala.v1.model.GlobalErrorResponse
import com.huaweicloud.cs.scala.v1.model.JobAuditLog
import com.huaweicloud.cs.scala.v1.client._
import com.huaweicloud.cs.scala.v1.client.CollectionFormats._
import com.huaweicloud.cs.scala.v1.client.ApiKeyLocations._

object LogApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[JobAuditLog] (审计日志列表查询成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param resourceType 资源类型，包括job、template和cluster
   * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。
   * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
   * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
   * @param xProjectId2 可选。project id，用于不同project取token。
   * @param xAuthToken 使用Token认证时必选: 用户Token
   * @param cursor 作业ID游标
   * @param resourceId 资源ID
   * @param pageNumber 查询的页码
   * @param limit 查询条数限制
   */
  def getJobAuditLogs(xProjectId: String, resourceType: String, xSdkDate: Option[String] = None, authorization: Option[String] = None, host: Option[String] = None, xProjectId2: Option[String] = None, xAuthToken: Option[String] = None, cursor: Option[String] = None, resourceId: Option[String] = None, pageNumber: Option[Int], limit: Option[Int] = None): ApiRequest[Seq[JobAuditLog]] =
    ApiRequest[Seq[JobAuditLog]](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/audit_logs", "application/json")
      .withQueryParam("resource_type", resourceType)
      .withQueryParam("cursor", cursor)
      .withQueryParam("resource_id", resourceId)
      .withQueryParam("page_number", pageNumber)
      .withQueryParam("limit", limit)
      .withPathParam("X-Project-Id", xProjectId)
      .withHeaderParam("X-Sdk-Date", xSdkDate)
      .withHeaderParam("Authorization", authorization)
      .withHeaderParam("Host", host)
      .withHeaderParam("X-Project-Id", xProjectId2)
      .withHeaderParam("X-Auth-Token", xAuthToken)
      .withSuccessResponse[Seq[JobAuditLog]](200)
      .withErrorResponse[GlobalErrorResponse](400)
      

}

